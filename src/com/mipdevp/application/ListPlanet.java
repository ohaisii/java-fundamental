package com.mipdevp.application;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {

    public static void main(String[] args) {


        //Buat List
        List<String> planets = new ArrayList<>();

        //Add item
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Earth");

        System.out.println("List planets awal:");
        for (int i = 0; i < planets.size(); i++) { // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
        planets.remove("Venus"); // method remove() untuk mengeluarkan objek dari List
        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }

    }

}
