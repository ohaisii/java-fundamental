package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {

    //Penggunaan input : BufferedReader
    public static void main(String[] args) {

        //Inisialisasi awal
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan sederhana dengan BufferedReader");
        int value = 0;
        int anotherValue = 0;
        //Harus pake try catch ya kalo pake BufferedReader
        try {
            System.out.print("Masukan Angka pertama : ");
            //Hasil tangkapan ketikkan user di simpan di value yang di parsing, dan menyimpan nya pada bufferedReader.readline()
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan Angka kedua : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
