package com.mipdevp.data;

import com.mipdevp.data.Animal;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Kucing juga butuh makan");
    }

    @Override
    public void meow() {
        System.out.println("Meow meow");
    }
}
