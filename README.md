# Learn Java Fundamental

### Tipe Data
<p>Java merupakan bahasa pemrograman yang strongly typed, maka kita tidak bisa mengabaikan tipe data. Kita harus tahu data seperti apa yang disimpan ke dalam variabel. Selain itu, Java juga bersifat statically typed, yang artinya setiap variabel harus dideklarasikan terlebih dahulu sebelum digunakan</p>
<p>Terdapat 2 (dua) jenis tipe data pada Java, yaitu tipe data primitif dan reference. </p>

#### Tipe Data Primitif
1. Byte
2. Short
3. Int
4. Long
5. Float
6. Double
7. Boolean
8. Char

#### Tipe Data Reference
<p>Tipe data reference merupakan sebuah tipe data yang merujuk ke sebuah objek atau instance dari sebuah class. Salah satu tipe data yang termasuk ke dalam tipe data reference adalah string. Tipe data string menunjuk ke instance dari class java.lang.String</p>
<p>Selain itu, kita bisa membuat tipe data sendiri. Sebagai contoh, ketika kita memiliki sebuah kelas User, kita bisa membuat variabel baru dengan tipe data class User tersebut. Kita perlu membuat instance dari kelas tersebut:</p>
<pre>
User user = new User();
</pre>
<p>Dengan begitu kita bisa mengakses semua atribut dan fungsi yang ada pada kelas User menggunakan variabel user.</p>

### String
<p>Di dalam bahasa pemrograman Java, string merupakan sebuah tipe data reference. Tipe data ini diperlakukan sebagai sebuah obyek. String adalah kumpulan beberapa karakter (char).</p>
<pre>
String greeting = "Hello World!";
</pre>
<p>Atau :</p>
<pre>
char[] charExample = { 'j', 'a', 'v', 'a' };
String stringExample = new String(charExample);
System.out.println(stringExample);
</pre>

#### Panjang String
<pre>
String fullName = "Jution Candra Kirana";
int length = fullName.length();
System.out.println(length);
</pre>


#### Ambil Karekter
<pre>
String fullName = "Jution Candra Kirana";
char result = fullName.charAt(2);
System.out.println(result);
</pre>

No | Nama | Keterangan
------------ | -------------
1 | length() | Buat cari panjang karakter
2 | charAt(int index) | Buat mengambil sebuah karakter
3 | format(String format, Object… args) | Format string
4 | substring(int beginIndex) | Mengembalikan/menghasilkan substring berdasarkan indeks yang diberikan.
5 |contains(CharSequence s) | Mengembalikan/menghasilkan nilai true atau false setelah mencocokkan karakter.
6 | equals(Object object) | Memeriksa apakah nilai objek sama dengan nilai string.
7 | isEmpty() | Memeriksa apakah sebuah string itu kosong atau tidak.
8 | concat(String s) | Sambung string
9 | replace(char a, char b) | ganti suatu karakter
10 | indexOf(String a) | Cari index dari sebuah string
11 | toLowerCase() | Jadi huruf kecil
12 | toUpperCase() | Jadi huruf besar
13 | trim() | Menghapus spasi awal dan akhir dari string.
14 | valueOf(int value) | Mengkonversi tipe yang diberikan menjadi sebuah string.
15 | compareTo() | Membandingkan dua nilai

<p>Sumber : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html. </p>