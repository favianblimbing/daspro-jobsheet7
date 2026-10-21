import java.util.Scanner;

public class KafeDoWhile13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;

        // perulangan DO-WHILE dengan kondisi true
        do {
            // input nama pelanggan
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            // cek isi namaPelanggan
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            // input banyaknya item yang dibeli
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            // hitung dan tampilkan total harga
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            // membersihkan newline dari buffer
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");

        // menutup scanner
        sc.close();
    }
}