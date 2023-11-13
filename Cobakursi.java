import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // Daftar film dan waktu tayang
        String[] film = { "Film A", "Film B", "Film C" };
        String[] waktuTayang = { "12:00", "15:00", "18:00", "21:00" };

        // Menampilkan daftar film
        System.out.println("Daftar Film yang Tersedia:");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i + 1) + ". " + film[i]);
        }

        // Meminta pengguna memilih film
        System.out.print("Pilih nomor film yang ingin ditonton: ");
        int filmPilihan = input.nextInt();

        // Memeriksa apakah nomor film yang dimasukkan valid
        if (filmPilihan < 1 || filmPilihan > film.length) {
            System.out.println("Pilihan film tidak valid.");
            return;
        }

        // Menampilkan daftar waktu tayang
        System.out.println("Waktu Tayang untuk " + film[filmPilihan - 1] + ":");
        for (int i = 0; i < waktuTayang.length; i++) {
            System.out.println((i + 1) + ". " + waktuTayang[i]);
        }

        // Meminta pengguna memilih waktu tayang
        System.out.print("Pilih nomor waktu tayang: ");
        int waktuPilihan = input.nextInt();

        // Memeriksa apakah nomor waktu tayang yang dimasukkan valid
        if (waktuPilihan < 1 || waktuPilihan > waktuTayang.length) {
            System.out.println("Pilihan waktu tayang tidak valid.");
            return;
        }

        // Meminta pengguna memasukkan tanggal
        System.out.print("Masukkan tanggal (DD-MM-YYYY): ");
        String tanggal = input.next();

        // Konfirmasi pemesanan
        System.out.println("Pemesanan tiket berhasil!");
        System.out.println("Film: " + film[filmPilihan - 1]);
        System.out.println("Waktu Tayang: " + waktuTayang[waktuPilihan - 1]);
        System.out.println("Tanggal: " + tanggal);
    }
}