package com.mipdevp.javafundamental.basic.functional;

public class SimpleFunctionWithParams {

    public static void main(String[] args) {

        //call function with parameter
        universityName("Politeknik Negeri lampung", "B");

    }

    //make a function not return, just write void
    public static void universityName(String campusName, String accreditation) {

        String result = "Kampus " + campusName + " Akreditasi " + accreditation;
        System.out.println(result);

    }
}
