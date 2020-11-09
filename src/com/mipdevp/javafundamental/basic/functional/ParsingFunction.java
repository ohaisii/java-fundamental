package com.mipdevp.javafundamental.basic.functional;

public class ParsingFunction {

    public int Age;

    //Parsing by Value
    void printAge(int age) {

        System.out.println("Print umur dari  printAge " + age);
    }

    //Parsing by Reference
    ParsingFunction(int age) {
        this.Age = age;
    }

    void printAgeAgain(ParsingFunction v) {
        v.Age+=1;
        System.out.println("Print umur dari method printAgeAgain " + v.Age);
    }
}

class Result {
    public static void main(String[] args) {

        ParsingFunction parsingFunction = new ParsingFunction(25);
        int age = parsingFunction.Age;

        System.out.println("Umur awal " + parsingFunction.Age);
        System.out.println("Parsing by Value");
        System.out.println("Umur sebelum pemanggilan method " + age);
        parsingFunction.printAge(age);
        System.out.println("Umur setelah pemanggilan method " + age);
        System.out.println("Parsing by Reference");
        System.out.println("Umur sebelum pemanggilan method " + parsingFunction.Age);
        parsingFunction.printAgeAgain(parsingFunction);
        System.out.println("Nama setelah pemanggilan method " + parsingFunction.Age);
    }

}
