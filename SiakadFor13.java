import java.util.Scanner;

public class SiakadFor13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        // input nilai mahasiswa
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // menentukan nilai tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            // menentukan nilai terendah
            if (nilai < terendah) {
                terendah = nilai;
            }

            // menghitung mahasiswa lulus / tidak lulus (batas 60)
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        // menampilkan nilai tertinggi dan terendah
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        // menampilkan jumlah mahasiswa lulus dan tidak lulus
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        // menutup scanner
        sc.close();

    }
}