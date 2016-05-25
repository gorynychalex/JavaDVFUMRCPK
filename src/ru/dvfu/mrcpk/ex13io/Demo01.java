package ru.dvfu.mrcpk.ex13io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        // Поток на чтение байт из файла
        FileInputStream inputStream = new FileInputStream("c:/test/data1.txt");
        // Поток на запись байт в файл
        FileOutputStream outputStream = new FileOutputStream("c:/test/data2.txt");

        // Массив 1000 байт
        byte[] b = new byte[1000];

        // Цикл чтения байт из входного потока, пока есть еще непрочитанные байты
        while (inputStream.available()>0){
            // Поблочное чтение и передача в переменную
            int str = inputStream.read(b);
            // Поблочная запись в поток вывода
            outputStream.write(str);
        }

        // Закрытие потоков
        inputStream.close();
        outputStream.close();


    }
}
