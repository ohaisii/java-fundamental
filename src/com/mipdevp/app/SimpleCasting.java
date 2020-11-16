package com.mipdevp.app;

public class SimpleCasting {

    public static void main(String[] args) {

        //int a = 3.14; //Error must Casting
        int a = (int) 3.14;
        System.out.println(a);

        double dou = 3.14;
        String result = String.valueOf(dou);
        System.out.println(result);

    }
}
