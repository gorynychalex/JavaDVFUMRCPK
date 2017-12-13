package ru.dvfu.mrcpk.ex06dates;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ExampleDate {
    public static void main(String[] args) throws ParseException {

        // Текущая дата
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        SimpleDateFormat sdfHMS = new SimpleDateFormat("M-H-S", Locale.ENGLISH);
        String s = "05-may-1997";
        Date d1 = sdf.parse(s);
        Date d2 = sdf.parse("29-jun-1999");




        System.out.println(Calendar.getInstance().getTime());
        System.out.println(sdf.format(d1));
        System.out.println(d1.before(d2));
    }
}
