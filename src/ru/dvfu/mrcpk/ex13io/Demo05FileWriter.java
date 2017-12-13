package ru.dvfu.mrcpk.ex13io;

import java.io.FileWriter;
import java.io.IOException;

public class Demo05FileWriter {
    public static void main(String[] args) {

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("/home/gorynych/fileDemoWriter.txt",true);
            fileWriter.write("New text\n");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
