package ru.dvfu.mrcpk.tests.testpackage.p2;

import com.sun.org.apache.xpath.internal.SourceTree;
import ru.dvfu.mrcpk.tests.testpackage.p1.ParantUtil;

public class ChildUtil extends ParantUtil {
    public static void main(String[] args) {

    }

    void callStuff(){
        System.out.println("this " + this.doStuff());
        ParantUtil p = new ParantUtil();
//        System.out.println(" parent " + p.doStuff());
    }
}
