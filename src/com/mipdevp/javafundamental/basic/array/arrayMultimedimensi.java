package com.mipdevp.javafundamental.basic.array;

public class arrayMultimedimensi {

    public static void main(String[] args) {

        //pembutan array mutltidimensi di java cukup tambahkan [] 2x
        int[][] angkaAcak = new int[2][];
        angkaAcak[0] = new int[2];
        angkaAcak[0][0] = 1;

        //cetak array multidimensi
        System.out.println("Array dimensi ke 1 index 0 dan dimensi ke 2 index 0 = " + angkaAcak[0][0]);
    }
}
