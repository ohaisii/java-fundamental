package com.mipdevp.application;

import com.mipdevp.data.Car;

public class CarApp {

    public static void main(String[] args) {

        //Memanggil class Car dari package data dengan menggunakan metode encapsulation
        Car car = new Car();

        //Kita beri nilai car dengan pemanfaatan setter
        car.setCarName("Toyota Avanza");
        car.setTier(4);
        car.setCarType("MVP");

        //Menampilkan dengan memanggil fungsi getter
        System.out.println(car.getCarName());
        System.out.println(car.getTier());
        System.out.println(car.getCarType());
    }
}
