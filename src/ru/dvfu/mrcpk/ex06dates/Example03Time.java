package ru.dvfu.mrcpk.ex06dates;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Пример работы с датой при помощи библиотеки JDK <1.8>java.time </1.8>
 */
public class Example03Time {

    public static void main(String[] args) {

        //Текущие значения даты, времени, даты-времени
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        //Формат даты и вывод в этом формате
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("u-MM-dd HH:mm");
        System.out.println("Сейчас: " + localDateTime.format(dateTimeFormatter));

        //Создаем LocalDateTime передавая в качестве аргументов
        //год, месяц, день, час, минуту, сукенду
        LocalDateTime randDate = LocalDateTime.of(2016, Month.MARCH, 8, 12, 30, 50);
        System.out.println("Задана дата: " + randDate.format(dateTimeFormatter));

        // Определение разницы между датами
        Period period = Period.between(localDate, LocalDate.ofEpochDay(randDate.toEpochSecond(ZoneOffset.UTC)));
        System.out.println("Разница между ними: " + period.getMonths() + " месяцев и " + period.getDays() + " дней");
    }

}
