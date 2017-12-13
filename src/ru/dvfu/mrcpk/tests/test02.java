package ru.dvfu.mrcpk.tests;

public class test02 {
    public static void main(String[] args) {

        int x=5, y;
        for( ; x < 5; ){
            System.out.println(--x);
        }

        try
        {
            y = 5 / x;
        } catch (ArithmeticException e)
        {

        } catch (NullPointerException e){
            System.out.println("NullPointerException");
        } catch (Exception e){
            System.out.println("Exception!");
        }
        System.out.println("finished");
    }
}
