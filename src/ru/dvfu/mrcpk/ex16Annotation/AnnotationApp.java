package ru.dvfu.mrcpk.ex16Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class AnnotationApp {
    public static void main(String[] args) {

        Class clazz;
        try {
            clazz = Class.forName("ru.dvfu.mrcpk.ex16Annotation.Cookies");
            if(!clazz.isAnnotationPresent(ControlledObject.class)){
                System.err.println("no annotation");
            } else {
                System.out.println("class annotated ; name - " + clazz.getAnnotation(ControlledObject.class));
            }

            boolean hasStart = false;
            boolean hasStop = false;

            Method[] methods = clazz.getMethods();
            for(Method method: methods){
                if(method.isAnnotationPresent(StartObject.class)) { hasStart = true; }
                if(method.isAnnotationPresent(StopObject.class)) { hasStop = true; }
                if(hasStart && hasStop) { break; }
            }

            System.out.println("Start annotaion - " + hasStart + ", Stop annotaion - " + hasStop);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

@ControlledObject(name = "biscuits",value = 7)
class Cookies {

    @StartObject
    public void createCookie(){
        System.out.println("Create Cookie Metod");
    }

    @StopObject
    public void stopCookie(){
        System.out.println("Stop Cookie");
    }
}