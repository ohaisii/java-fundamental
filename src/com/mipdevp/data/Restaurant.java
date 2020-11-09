package com.mipdevp.data;

class Restaurant {

    public String menu = "Ayam Goreng";
    public int harga = 25000;

}

class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        //Ketika di jalankan akan error, karena menu dan harga menggunakan access modifier private, kecuali 1 class
        //System.out.println(restaurant.menu);
        //System.out.println(restaurant.harga);

        //Setelah kita ubah menjadi public maka dapat di akses di luar class itu.
        System.out.println(restaurant.menu);
        System.out.println(restaurant.harga);


    }
}
