package ru.dvfu.mrcpk.patterns.p14Observer;

public class MeteoApp {
    public static void main(String[] args) {

    }
}

interface Observer{
    void handleEvent(int temp, int presser);
}


