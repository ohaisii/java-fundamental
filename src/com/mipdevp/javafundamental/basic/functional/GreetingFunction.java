package com.mipdevp.javafundamental.basic.functional;

public class GreetingFunction {

    public static void main(String[] args) {

        //Call function with return
        String greeting = Greetings("Jution Candra Kirana", 25);
        System.out.println(greeting);
    }

    public static String Greetings(String name, int age) {

        return "Hello my Name is " + name + ", I " + age + " years old";
    }
}
