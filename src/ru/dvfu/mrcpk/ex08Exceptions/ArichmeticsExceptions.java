package ru.dvfu.mrcpk.ex08Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArichmeticsExceptions {

    public static void main(String[] args) throws IllegalAccessException {
        int x=10, y=0;
        try {
            FileInputStream f=new FileInputStream("c:/Intel/file.txt");
            while (f.available()>0){
                int b = (int) f.read();
                System.out.print(b + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



//        try (FileInputStream fileInputStream= new FileInputStream("c:/fog"); )
//        {
//            URL url = new URL("http://www.ya.ru");
//            throw new IllegalAccessException();
//        }
//        catch (FileNotFoundException e){
//            System.out.println("IOExce");
//        } catch (MalformedURLException e){
//            System.out.println("Не верно указан адрес");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//

//            int z = divide(x,y);
    }

    public static int divide(int x, int y)
    {
        int a=0;
        try{
            a = x/y;
        } finally {
            System.out.println("Finally");
        }
        return a;
    }
}
