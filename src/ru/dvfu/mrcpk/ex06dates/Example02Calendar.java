package ru.dvfu.mrcpk.ex06dates;

//Пример работы с датой при помощи класса Calendar

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Example02Calendar {

    public static void main(String[] args) {

        //Получение текущей даты и времени
        Calendar c = Calendar.getInstance();
        System.out.println("Натоящее время (Calendar) без форматирования: " + c);
        System.out.println("Время в секундах = " + c.getTimeInMillis());

        //Вывод с раздельным форматированием (обратить внимание на вывод месяца)
        System.out.print("Дата: " + c.get(Calendar.YEAR) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.DATE));
        System.out.println(" время: " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE));


        //Установка еще одной даты
        Calendar c1 = Calendar.getInstance();
        c1.set(1999,5,24);

        //Вывод установленной даты
        System.out.println("\nУстановлена дата: " + c1.get(Calendar.YEAR) + "/" + (c1.get(Calendar.MONTH)+1) + "/" + c1.get(Calendar.DATE));

        //Вычисление разницы в миллисекундах
        long cDiff = c.getTimeInMillis() - c1.getTimeInMillis();

        System.out.println("Разница в миллисекундах = " + cDiff);
        System.out.println("Разница в секундах = " + (cDiff/1000L));
        System.out.println("Разница в секундах = " + TimeUnit.MILLISECONDS.toSeconds(cDiff));
        System.out.println("Разница в минутах = " + (cDiff/(1000L*60)));
        System.out.println("Разница в минутах = " + TimeUnit.MILLISECONDS.toMinutes(cDiff));
        System.out.println("Разница в часах = " + (cDiff/(1000L*60*60)));
        System.out.println("Разница в часах = " + TimeUnit.MILLISECONDS.toHours(cDiff));
        System.out.println("Разница в днях = " + (cDiff/(1000L*60*60*24)));
        System.out.println("Разница в днях = " + TimeUnit.MILLISECONDS.toDays(cDiff));
        System.out.println("Разница в месяцах = " + (cDiff/(1000L*60*60*24*12)));
        System.out.println("Разница в годах (грубо по 365 дней) =  " + (cDiff/(1000L*60*60*24*365)));
        System.out.println("Разница всего: " + (cDiff/(1000L*60*60*24*365)) + " лет, "
                + (cDiff/(1000L*60*60*24*12))%12 + " месяцев, "
                + (cDiff/(1000L*60*60*24))%24 + " дней, "
                + TimeUnit.MILLISECONDS.toHours(cDiff)%60 + " часов, "
                + TimeUnit.MILLISECONDS.toMinutes(cDiff)%60 + " минут");


    }
}
