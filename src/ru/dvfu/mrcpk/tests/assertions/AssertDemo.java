package ru.dvfu.mrcpk.tests.assertions;

public class AssertDemo {
    public static void main(String[] args) {
        AssertDemo d = new AssertDemo();
        System.out.println(d.isAgeValid(130));
    }

    public boolean isAgeValid(int age){
        assert (age < 150): "Age entered is: " + age;

        if(age > 0)
            return true;
        else
            return false;
    }
}

