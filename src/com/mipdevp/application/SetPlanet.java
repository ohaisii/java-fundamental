package com.mipdevp.application;

import java.util.HashSet;
import java.util.Set;

public class SetPlanet {

    public static void main(String[] args) {

        //Buat Set dengan hashSet
        Set<String> planets = new HashSet<>();

        //Add item, (duplicate)
        planets.add("Mercury");
        planets.add("Mercury"); //Duplicate, hidden
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Earth");

        //Mendapatkan ukuran
        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for(String planet: planets ) {
            System.out.println("\t " + planet);
        }
    }
}
