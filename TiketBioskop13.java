import java.util.Scanner;

public class TiketBioskop13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        final int HARGA_TIKET = 50000;
        int jumlahTiket, persenDiskon, hargaAwal, potongan, hargaBayar;
        int totalTiket = 0;
        int totalPenjualan = 0;
        int pelanggan = 0;

        // perulangan sampai input 0 (penjualan hari ini selesai)
        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            // input negatif diabaikan, minta input ulang
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket yang valid!");
                continue;
            }

            // input 0 menghentikan perulangan
            if (jumlahTiket == 0) {
                break;
            }

            // menentukan diskon
            if (jumlahTiket > 10) {
                persenDiskon = 15;
            } else if (jumlahTiket > 4) {
                persenDiskon = 10;
            } else {
                persenDiskon = 0;
            }

            // menghitung harga
            hargaAwal = jumlahTiket * HARGA_TIKET;
            potongan = hargaAwal * persenDiskon / 100;
            hargaBayar = hargaAwal - potongan;

            // menampilkan rincian pelanggan
            pelanggan++;
            System.out.println("Pelanggan ke-" + pelanggan);
            System.out.println("  Harga awal : Rp " + hargaAwal);
            System.out.println("  Diskon     : " + persenDiskon + "% (Rp " + potongan + ")");
            System.out.println("  Total bayar: Rp " + hargaBayar);

            // mengakumulasi total harian
            totalTiket += jumlahTiket;
            totalPenjualan += hargaBayar;
        }

        // menampilkan rekap penjualan satu hari
        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Jumlah pelanggan     : " + pelanggan);
        System.out.println("Total tiket terjual  : " + totalTiket);
        System.out.println("Total penjualan      : Rp " + totalPenjualan);

        // menutup scanner
        sc.close();
    }
}