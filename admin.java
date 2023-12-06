import java.util.Scanner;

public class admin {
    static int banyakFilm = 2;
    static String[] judulFilm = new String[banyakFilm];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Ubah Tanggal");
            System.out.println("2. Ubah Film");
            System.out.print("Pilih yang ingin dirubah: ");
            int pilihPerubahan = sc.nextInt();

            if (pilihPerubahan == 1) {
                ubahTanggal();
            } else if (pilihPerubahan == 2) {
                ubahFilmMenu();
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }
    }

    static void ubahTanggal() {
        System.out.print("Masukkan Tanggal untuk Pemutaran & hari ke depan: ");
        int adminInput = sc.nextInt();
        System.out.print("Masukkan Bulan: ");
        int adminBulan = sc.nextInt();
        System.out.print("Masukkan Tahun: ");
        int tahun = sc.nextInt();
        int[] hari = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Tanggal pemutaran film yang akan tampil: ");
        for (int i = adminInput; i < adminInput + 7; i++) {
            if (i <= hari[adminBulan - 1]) {
                System.out.println(i + " " + (adminBulan) + " " + tahun);
            } else {
                break;
            }
        }
    }

    static void ubahFilmMenu() {
        String judulFilmBaru;

        System.out.println("Daftar film saat ini: ");
        for (String judul : judulFilm) {
            System.out.println(judul);
        }

        System.out.print("Apakah anda ingin mengubah jumlah film?(y/n): ");
        String validasiubahjumlahFilm = sc.next();
        if (validasiubahjumlahFilm.equalsIgnoreCase("y")) {
            ubahJumlahFilm();
        }
         System.out.println("Daftar film saat ini: ");
        for (String judul : judulFilm) {
            System.out.println(judul);
        }

        System.out.print("Apakah anda ingin mengubah film (y/n)?");
        String validasiUbahFilm = sc.next();

        if (validasiUbahFilm.equalsIgnoreCase("y")) {
            System.out.println("Film mana yang ingin anda rubah");
            int inputUbahFilm = sc.nextInt();
            sc.nextLine();

            System.out.println("Masukkan Judul Film Baru");
            judulFilmBaru = sc.nextLine();

            ubahFilm(inputUbahFilm, judulFilmBaru);

            System.out.println("List Film Baru");
            for (String judul : judulFilm) {
                System.out.println(judul);
            }
        } else if (validasiUbahFilm.equalsIgnoreCase("n")) {
            return;
        } else {
            while (true) {
                System.out.println("inputan salah");
                System.out.print("Apakah anda ingin mengubah film (y/n)?");
                validasiUbahFilm = sc.next();
                if (validasiUbahFilm.equalsIgnoreCase("y") || validasiUbahFilm.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
    }

    static void ubahFilm(int inputUbahFilm, String judulFilmBaru) {
        judulFilm[inputUbahFilm - 1] = judulFilmBaru;
    }

    static void ubahJumlahFilm() {
        System.out.print("Masukkan banyak film baru: ");
        banyakFilm = sc.nextInt();
        sc.nextLine();

        String[] judulFilmBaru = new String[banyakFilm];

        for (int i = 0; i < judulFilmBaru.length; i++) {
            System.out.print("Masukkan judul film baru ke-" + (i + 1) + " : ");
            judulFilmBaru[i] = sc.nextLine();
            System.out.println();
        }

        judulFilm = judulFilmBaru;
    }
}
