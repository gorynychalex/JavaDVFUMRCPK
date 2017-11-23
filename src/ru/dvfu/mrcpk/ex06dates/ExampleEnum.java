package ru.dvfu.mrcpk.ex06dates;

/**
 * Created by Admin on 23.11.2017.
 */
public class ExampleEnum {

    public static void main(String[] args) {
//        Season season = Season.WINTER;
//        System.out.println(season.getDesc());
//        System.out.println(Season.valueOf("AUTUMN") + " == " + Season.AUTUMN + " = " + Season.AUTUMN.getDesc());

        //Вывод всех сезонов
        for(Season season1: Season.values()) {
            System.out.println(season1.ordinal()+1 + ") " + season1 + " - " + season1.getDesc());
        }

        System.out.println();

        for(Months month: Months.values()){
            System.out.println(month.ordinal()+1 + ") " + month + ": " + month.getDays() + " days");
        }
    }

}

enum Season {
    WINTER("Cold season"),
    SPRING("Cool season"),
    SUMMER("Hot season"),
    AUTUMN("Cool season");

    private String desc;

    Season(String desc) {
        this.desc = desc;
    }

    public String getDesc() {return desc; }
}

enum Months {
    January(31),
    Fabruary(28),
    March(31),
    April(30),
    May(31),
    June(30),
    July(31),
    August(31),
    September(30),
    October(31),
    Noveber(30),
    December(31);

    private int days;

    Months(int i) {
        this.days = i;
    }

    public int getDays() {
        return days;
    }
}