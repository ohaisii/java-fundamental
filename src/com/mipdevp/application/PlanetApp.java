package com.mipdevp.application;

import com.mipdevp.data.Planet;

import java.util.ArrayList;
import java.util.List;

public class PlanetApp {

    public static void main(String[] args) {

        //List with type-parameter Planet
        List<Planet> planets = new ArrayList<>();

        //Add List to Planet class
        planets.add(new Planet("Mercury", 0.80));

        //Print result
        for(Planet p : planets) {
            p.print();
        }



    }
}
