package ru.dvfu.mrcpk.patterns.p05Builder;

public class PatternBuilderFromAbstract {

    public static void main(String[] args) {
        Director director = new Director();
        director.setCarBuilder(new NissanBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}


