package com.mipdevp.app;

import java.util.Date;

public class ExampleSystemCurrentMilis {

    public static void main(String[] args) {

        long timeNow = System.currentTimeMillis();
        System.out.println(timeNow);

        Date date = new Date();
        System.out.println(date.toString());
    }
}
