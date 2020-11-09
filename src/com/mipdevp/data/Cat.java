package com.mipdevp.data;

public class Cat extends Animal {

    //Add variable
    private String ras;
    private String habitat;

    public Cat(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Cat ras is " + ras + ", habitat is " + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat other = (Cat) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }

    public Cat() {
        super();
        System.out.println("Constructor from cat Class");
    }

    //Method Overriding
    @Override
    public void Eating() {
        System.out.println("Cat was eat too...");
    }

    //Method Overloading
    public void Eating(String food) {
        System.out.println("Cat was eat " + food);
    }
}
