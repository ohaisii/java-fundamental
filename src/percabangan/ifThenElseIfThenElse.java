package percabangan;

public class ifThenElseIfThenElse {

    public static void main(String[] args) {

        int nilaiUjian = 80;
        char indexPrestasi;

        if (nilaiUjian >= 80) {
            indexPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indexPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indexPrestasi = 'D';
        } else if (nilaiUjian >= 50) {
            indexPrestasi = 'E';
        } else {
            indexPrestasi = 'F';
        }
        System.out.println("Nilai ujian anda adalah =" + indexPrestasi);
    }
}
