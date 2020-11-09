package com.mipdevp.application;

import com.mipdevp.data.Animal;
import com.mipdevp.data.Cat;

public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Animal(); //Create object from constructor
        System.out.println("What is animal a OBJECT " + (animal instanceof Object));
        System.out.println("What is animal a ANIMAL " + (animal instanceof Animal));
        System.out.println("What is animal a CAT " + (animal instanceof Cat));

        System.out.println("=============================");

        Cat cat = new Cat();
        System.out.println("What is cat a OBJECT " + (cat instanceof Object));
        System.out.println("What is cat a ANIMAL " + (cat instanceof Animal));
        System.out.println("What is cat a CAT " + (cat instanceof Cat));

        System.out.println("=============================");

        animal.Eating();

        //Call this after add method overriding and overloading
        cat.Eating();
        cat.Eating("Fish");

        System.out.println("=============================");

        Cat meow = new Cat("Persia", "Tropis");
        Cat puss = new Cat("Persia", "Subtropis");
        Cat cutes = new Cat("Abisinia", "Subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(cutes.toString());

        //Equals first parameter
        System.out.println("meow equal to puss " + meow.equals(puss));
        System.out.println("puss equal to cutes " + meow.equals(cutes));
    }


}
