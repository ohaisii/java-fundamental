package com.mipdevp.javafundamental.basic.perulangan;

public class forLoopNested {

    public static void main(String[] args) {

        int a = 5; //Mendefinikasikan batas maksimal jumlah yang akan di jadikan patokan bintang segitiga
        //for pertama mengimplementasikan bintang pada baris pertama kolom pertama
        for(int i = 1; i <= a; i++) {
            //for kedua mengimplementasikan hasil dari form pertama, terlihat pada inisialisasi j <= i
            for(int j = 1; j <= i; j++) {
                //akan mencetak * seusai urutan perulangan pertama lalu ke 2
                System.out.print("*");
            }
            //memberikan enter agar terbentuk pola segitiga nya
            System.out.println();
        }
    }
}
