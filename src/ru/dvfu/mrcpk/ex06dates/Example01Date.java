package ru.dvfu.mrcpk.ex06dates;

//Пример работы с датой при помощи класса Date

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Example01Date {
    public static void main(String[] args) throws ParseException {

        // Текущая дата
        Date dateNow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        // Вывод текущей даты в консоль
        System.out.println("Настоящее время (без форматирования): " + dateNow.toString());
        System.out.println("Настоящее время в формате dd-MMM-yyyy: " + sdf.format(dateNow));

        // В одну строку
        System.out.println("\nНастоящее время: "+ new SimpleDateFormat("HH:mm:ss yyyy/M/d").format(new Date()));


        // Произвольно заданная дата в текстовом формате
        String s = "05-may-1997";
        Date d1 = sdf.parse(s);
        Date d2 = sdf.parse("29-jun-1999");

        // Вывод произвольно заданной даты
        System.out.println("Заданная дата : " + sdf.format(d1));
    }
}
