package com.mipdevp.app;

import com.mipdevp.data.Animal;
import com.mipdevp.data.Cat;

public class AnimalApp {

    public static void main(String[] args) {

        Cat anggora = new Cat();
        Animal animal = anggora;

        animal = (Animal) anggora; //secara explisit melakukan casting dari subclass ke superclass

        Animal animal1 = new Cat();
        ((Cat) animal1).meow(); //downcast hewan ke kucing, casting dari superclass ke subclass


    }
}
