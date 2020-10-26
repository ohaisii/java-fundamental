package com.mipdevp.javafundamental.basic.perulangan;

public class While {

    public static void main(String[] args) {

        System.out.println("Perulangan while");
        //Untuk while, pertama kita definisikan dulu nilai i awal yaitu 1 (ini bebas)
        int i = 1;
        //bentuk dasar while hampir sama dengan bahasa pemrograman lainnya
        while (i < 10) {
            //akan mencetak tulisan ini sebanyak 9 kali
            System.out.println("Perulangan while ke - " + i);
            //jangan lupa berikan ini agar perulanga berjalan dan berhenti sesuai kondisi
            i++;
        }
    }
}
