url: www.pvsm.ru/java/3418

Аннотации представляют из себя дескрипторы, включаемые в текст программы, и используются для хранения метаданных программного кода, необходимых на разных этапах жизненного цикла программы.
Информация, хранимая в аннотациях, может использоваться соответствующими обработчиками для создания необходимых вспомогательных файлов или для маркировки классов, полей и т.д. 

Синтаксис
Аннотация задается описанием соответствующего интерфейса. 
Например так:

import java.lang.annotation.*;
@Target(value=ElementType.FIELD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface Name {
String name();
String type() default “string”;
}

Как видно из примера выше, аннотация определяется описанием с ключевым словом @interface и может включать в себя несколько полей, которые можно задать как обязательными, так и не обязательными. В последнем случае подставляется default значение поля.
Также из примера видно, что саму аннотацию можно пометить несколькими аннотациями.
Разберемся для начала, чем можно пометить собственную аннотацию, и зачем.

Аннотация @Retention позволяет указать жизненный цикл аннотации: будет она присутствовать только в исходном коде, в скомпилированном файле, или она будет также видна и в процессе выполнения. Выбор нужного типа зависит от того, как вы хотите использовать аннотацию, например, генерировать что-то побочное из исходных кодов, или в процессе выполнения стучаться к классу через reflection.

Аннотация @Target указывает, что именно мы можем пометить этой аннотацией, это может быть поле, метод, тип и т.д.

Аннотация @Documentedуказывает, что помеченная таким образом аннотация должна быть добавлена в javadoc поля/метода и т.д.
Например, класс, помеченный аннотацией без @Documented, будет выглядеть так:
public class TestClass
extends java.lang.Object

А если в описание аннотации добавить @Documented, получим:
@ControlledObject(name="name")
public class TestClass
extends java.lang.Object

Аннотация @Inherited помечает аннотацию, которая будет унаследована потомком класса, отмеченного такой аннотацией.
Сделаем для примера пару аннотаций и пометим ими класс.

@Inherited
@interface PublicAnnotate { }

@interface PrivateAnnotate { }

@PublicAnnotate
@PrivateAnnotate
class ParentClass { }

class ChildClass extends ParentClass { }

Класс ChildClass унаследует от родительского класса только аннотацию PublicAnnotate.

Пример своей аннотации.
Попробуем теперь написать рабочий пример с использованием аннотаций.
Представим себе, что у нас есть какой-то самодельный проект, который на вход получает класс, специально заанотированный, чтобы проект мог управлять жизненным циклом объектов этого класса, и пусть там будут аннотации StartObject, StopObject для описания методов класса, и ControlledObject для описания самого класса. Последней аннотации дадим еще поле name, путь там хранится якобы имя для поиска.
Аннотации будут выглядеть так:

@Target(value=ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface StartObject { 
}

@Target(value=ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface StopObject { 
}

@Target(value=ElementType.TYPE)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface ControlledObject { 
String name(); 
}

Напишем модуль, проверяющий подходит ли класс для загрузки в наш гипотетический проект или нет.
Сперва определим сам проверяемый класс.

@ControlledObject(name="biscuits")
public class Cookies {

@StartObject
public void createCookie(){
//бизнес логика
} 
@StopObject
public void stopCookie(){
//бизнес логика
}
}

Для того, чтобы работать с классом, сначала необходимо загрузить класс в контекст приложения. Используем:
Class cl = Class.forName("org.annotate.test.classes.Cookies");

Далее, через механизм reflection мы получаем доступ к полям и аннотациям класса.
Проверим наличие аннотированных методов в классе и аннотации на самом классе:

if(!cl.isAnnotationPresent(ControlledObject.class)){
System.err.println("no annotation");
} else {
System.out.println("class annotated ; name - " + cl.getAnnotation(ControlledObject.class));
} 
boolean hasStart=false;
boolean hasStop=false; 
Method[] method = cl.getMethods();
for(Method md: method){
if(md.isAnnotationPresent(StartObject.class)) {hasStart=true;}
if(md.isAnnotationPresent(StopObject.class)) {hasStop=true;}
if((hasStart==true)&&(hasStop==true)){break;}
}
System.out.println("Start annotaton - " + hasStart + "; Stop annotation - " + hasStop );

Запустив, на выходе мы получим:
Start annotaton — true; Stop annotation — true.
Если попробовать убрать одну из аннотаций, то вывод сообщит о несоответствии требованиям.

http://www.pvsm.ru/java/3418