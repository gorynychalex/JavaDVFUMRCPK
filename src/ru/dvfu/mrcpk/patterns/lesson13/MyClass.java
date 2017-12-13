package ru.dvfu.mrcpk.patterns.lesson13;

public class MyClass implements SomeClass.Callback {
    @Override
    public void callingBack(String s) {
        if (s != null)
            System.out.println("Answer " + s);
        else System.out.println("Answer is empty");
    }
}
