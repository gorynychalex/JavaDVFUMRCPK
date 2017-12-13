package ru.dvfu.mrcpk.ex12Thread;

public class Demo1 {
    private static String car = "BMW";

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start Car is " + car);
        A a = new A();
        B b = new B();
        a.start();
        b.start();

//        a.join();
//        b.join();
        System.out.println("Finish Car is " + car);

    }

    public static void changeA(){
        Demo1.car = "AUDI";
    }

    public synchronized static void changeB(){
        Demo1.car = "ГАЗ";
    }

    static class A extends Thread{
        public void run(){
            changeA();
        }
    }

    static class B extends Thread{
        public void run(){
            changeB();
        }

    }
}
