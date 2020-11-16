package com.mipdevp.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class WildcardGenericMethod {

    // mengunakan wildcards
    static void print(Collection<?> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }

    // menggunakan generic methods
    static <T> Collection arrayToCollection(T[] a) {
        return new ArrayList<>(Arrays.asList(a));
    }

    public static void main(String[] args) {
        String[] sa = { "Happy", "Coding" };
        Collection r = arrayToCollection(sa);
        print(r);
    }
}
