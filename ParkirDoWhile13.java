import java.util.Scanner;

public class ParkirDoWhile13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        int jenis, durasi, total = 0;

        do {
            // input jenis kendaraan
            System.out.print("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = sc.nextInt();

            // jika mobil atau motor, minta durasi parkir
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;   // tarif mobil
                } else {
                    total += durasi * 2000;   // tarif motor
                }
            }
        } while (jenis != 0);

        // menampilkan total pembayaran
        System.out.println("Total pembayaran parkir: Rp " + total);

        // menutup scanner
        sc.close();
    }
}