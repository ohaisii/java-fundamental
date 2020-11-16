package com.mipdevp.javafundamental.basic.perulangan;

public class DoWhile {

    public static void main(String[] args) {
        System.out.println("Perulangan do while");
        int i = 1;
        //Untuk do while, dia akan mencetak terlebih dahulu tulisan
        do {
            //akan mencetak ini
            System.out.println("Perulangan dengan do ke - " + i);
            //jangan lupa berikan increment
            i++;
        }
        //baru kondisikan perulangan di bawah/akhir
        while(i < 10);
    }
}

