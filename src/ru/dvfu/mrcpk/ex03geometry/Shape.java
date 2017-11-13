package ru.dvfu.mrcpk.ex03geometry;



import sun.security.provider.SHA;

import java.io.Serializable;
//Базовый класс геометрических фигур
public abstract class Shape {

    // Переменные для базовой точки фигуры
    public int x, y;
    // Переменная для цвета
    String color;

    // Пустой конструктор класса
    public Shape() {
    }

    //Конструктор класса с координатами базовой точки
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Методы класса
    public void draw(){
        System.out.println("Рисуем");
    };
    abstract int area();
    abstract int square();
    // Для будующего определения параметров
    public abstract void setParams(int[] x);
    public abstract void setParams(double[] x);
    public abstract void setParams(String[] x);
}

//Типовой класс для прямоугольника
class Rectangle extends Shape {
    // Поля класса
    //Переменные для сторон прямоугольника
    int a, b;

    // Пустой конструктор класса
    public Rectangle() {
    }

    // Конструктор с двумя параметрами
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Конструктор с параметрами базовой точки и сторон прямоугольника
    public Rectangle(int x, int y, int a, int b) {
        super(x,y);
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("прямоугольник: a = " + a + ", b = " + b);
    }

    @Override
    int area() {
        int x = 2 * a + 2 * b;
        System.out.println("Периметр: " + x);
        return x;
    }

    @Override
    int square() {
        int x = a * b;
        System.out.println("Площадь: " + x);
        return x;
    }

    @Override
    public void setParams(int[] x) {
        this.a = x[0];
        this.b = x[1];
    }

    @Override
    public void setParams(double[] x) {

    }

    @Override
    public void setParams(String[] x) {

    }
}


//Класс для окружности, наследующий
class Circle extends Shape{

    // Переменная для определения радиуса
    int r;

    //Пустой конструктор класса
    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public void draw() {

    }

    @Override
    int area() {
        return 0;
    }

    @Override
    int square() {
        return 0;
    }

    @Override
    public void setParams(int[] x) {

    }

    @Override
    public void setParams(double[] x) {

    }

    @Override
    public void setParams(String[] x) {

    }
}