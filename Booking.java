import java.util.Scanner;

public class Booking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variable
        int choiceFilm;
        String[] judulFilm = {"Spiderman", "Kingsman"};

        System.out.println(" ");
        System.out.println("Beli Tiket");
        System.out.println(" ");

        System.out.println("Daftar Film");
        System.out.println("1. " + judulFilm[0]);
        System.out.println("2. " + judulFilm[1]);
        System.out.println(" ");

        // Input film
        System.out.print("Pilih Film Yang Anda Inginkan: ");
        choiceFilm = sc.nextInt();

        System.out.println(" ");
        System.out.println("Film yang Anda pilih: " + judulFilm[choiceFilm - 1]);
        System.out.println(" ");

        // Masuk fitur pemilihan tanggal dan waktu
        // Deklarasi variable
        int[] hari = new int[31];
        String[] bulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus",
                "September", "Oktober", "November", "Desember"
        };
        int tahun = 2023;
        int adminInput = 3;
        int adminBulan = 12;

        // Nanti nyambung dengan admin memasukkan tanggal berapa sekarang
        // Outputnya yang dikeluarkan akan sebanyak yang diinputkan admin
        for (int i = 0; i <= 6; i++) {
            hari[i] = i + 1;

            System.out.println(hari[i] + " " + bulan[adminBulan - 1] + " " + tahun);

            // Studio
            for (int k = 0; k < 2; k++) {
                System.out.println("Studio " + (k + 1));

                // Waktu
                // Deklarasi
                int banyakJamAdmin = 4;
                String[] jam = {"13.00", "16.00", "19.00", "21.00"};
                System.out.println("Jam Penayangan: ");
                for (int j = 0; j < banyakJamAdmin; j++) {
                    System.out.println(jam[j]);
                }
            }
        }
    }
}
