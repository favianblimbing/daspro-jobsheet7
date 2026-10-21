import java.util.Scanner;

public class SiakadFor13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        double nilai, tertinggi = 0, terendah = 100;

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

        }
        // menampilkan nilai tertinggi dan terendah
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);


    }
}