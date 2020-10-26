package com.mipdevp.javafundamental.basic.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {

    //Learn Input with Scanner
    public static void main(String[] args) {

        //Inisialisasi awal penggunaan scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sederhana");
        System.out.print("Masukan Angka pertama : ");
        //Mengambil data yang diinput user, kemudian di masukkan melalui scanner, dengan pemanggilan Scanner.nextInt()
        //Penggunaan fungsi scanner harus sesuai ya, kalo angka ya int(Scanner.nextInt()), kalo huruf ya string(Scanner.next())
        int value = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
