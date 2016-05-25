package ru.dvfu.mrcpk.ex13io;

import java.io.*;

public class DemoChangeIN {
    public static void main(String[] args) throws IOException {
        String s = "This is new string";

        // ������� ��� ������ ����� ����� ByteArrayInputStream
        InputStream inputStream = new ByteArrayInputStream(s.getBytes());

        // ������� ���������� in - ����� �����
        System.setIn(inputStream);

        // �������� ���� �� ������ �����
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String string = bufferedReader.readLine();
            if(string == null) break;
            System.out.println(string);
        }
        bufferedReader.close();
    }
}
