package ru.dvfu.mrcpk.tests;

/**
 * Created by gorynych on 15.07.16.
 */
public class test06 {
    public int i = 5;
    public static void main(String args[])
    {
        class Foo
        {
            int i = 3;
        }
        Object o = (Object)new Foo();
        Foo foo = (Foo)o;
        System.out.println("i = " + foo.i);
    }
}
