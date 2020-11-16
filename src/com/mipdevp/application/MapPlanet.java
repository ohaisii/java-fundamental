package com.mipdevp.application;

import com.mipdevp.data.Planet;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {

    public static void main(String[] args) {

        //Buat map yang merepresentasikan class Planet
        Map<String, Planet> planets = new HashMap<>();

        //Add map with PUT
        planets.put("key-1", new Planet("Mercury", 0.06));
        planets.put("key-2", new Planet("Venus", 0.82));
        planets.put("key-3", new Planet("Mars", 1.00));
        planets.put("key-4", new Planet("Mars X", 1.00));

        for (String key : planets.keySet()) { // looping key dari Map
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + planets.get(key));
        }
    }
}
