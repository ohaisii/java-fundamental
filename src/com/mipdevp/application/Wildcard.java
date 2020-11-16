package com.mipdevp.application;

import com.mipdevp.data.Planet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcard {

    public static void main(String[] args) {

        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        print(planets);

        Collection<Planet> cp = new ArrayList<>();
        cp.add(new Planet("Mercury", 0.90));
        cp.add(new Planet("Venus", 1.00));
        print(cp);

    }

    public static void print(Collection<?> collection) { // perubahan ada di baris ini
        for (Object o : collection) {
            System.out.println(o);
        }
    }

}
