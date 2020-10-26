package com.mipdevp.javafundamental.basic.array;

public class intro {

    public static void main(String[] args) {
        //Array dalam bahasa Java dapat di tulis dengan :
        int[] namaVarArr = new int[5];

        //atau, namun cara kedua ini jarang di gunakan
        //int namaVarArray[] = new int[5];

        //Mengisi array
        namaVarArr[0] = 1;
        namaVarArr[1] = 2;
        namaVarArr[2] = 3;
        namaVarArr[3] = 4;
        namaVarArr[4] = 5;

        //Memanggil array yang telah diisi
        System.out.println(namaVarArr[0]);
        System.out.println(namaVarArr[1]);
        System.out.println(namaVarArr[2]);
        System.out.println(namaVarArr[3]);
        System.out.println(namaVarArr[4]);

        //Isi array jika sudah ada (contoh menggunakan String)
        String[] namaSayuran = {"Bayam", "Kol", "Sawi", "Brokoli", "Pakcoy", "Terong"};
        System.out.println(namaSayuran[0]);
        System.out.println(namaSayuran[1]);
        System.out.println(namaSayuran[2]);
        System.out.println(namaSayuran[3]);
        System.out.println(namaSayuran[4]);
        System.out.println(namaSayuran[5]);

        //atau dapat menggunakan perulangan
        for(int i = 1; i < namaSayuran.length; i++) {

            System.out.println(namaSayuran[i]);
        }

        //Catatan:
        //Array selalu di mulai dari index ke 0
    }
}
