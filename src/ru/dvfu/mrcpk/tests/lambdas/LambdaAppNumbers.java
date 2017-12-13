package ru.dvfu.mrcpk.tests.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaAppNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList();
//        List<Integer> list = Arrays.asList(15,30,75,29,3,44);

        //Show all numbers
        evalute(list, (n) -> true);

        evalute(list,(n) -> n > 0);
    }

    public static void evalute(List<Integer> list, Predicate<Integer> predicate){
        for(Integer i : list){
            if(predicate.test(i)){
                i/=10;
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
