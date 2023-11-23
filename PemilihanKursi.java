import java.util.Scanner;

public class PemilihanKursi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi Variabel
        int ubahbaris = 0;
        String[][] kursi = {
            {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10"},
            {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"},
            {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"},
            {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"},
            {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"},
        };

        // Input jumlah kursi yang ingin diambil
        System.out.print("Banyak kursi: ");
        int bnykKursi = sc.nextInt();

        // Pemilihan kursi jika jumlah kursi <= 2
        if (bnykKursi <= 2) {
            for (int k = 0; k < bnykKursi; k++) {
                // Menampilkan peta kursi
                tampilkanPetaKursi(kursi);

                // Input baris dan validasi
                String baris = inputBaris(sc);

                // Input kolom dan validasi
                int kolom = inputKolom(sc);

                // Reservasi kursi
                ubahbaris = baris.charAt(0) - 'A'; // Konversi baris ke indeks array
                kursi[ubahbaris][kolom] = " X";
            }

            // Menampilkan peta kursi setelah pemilihan
            tampilkanPetaKursi(kursi);
        } else { // Pemilihan kursi jika jumlah kursi > 2
            while (true) {
                // Menampilkan peta kursi
                tampilkanPetaKursi(kursi);

                // Input dan validasi baris awal
                String barisAwal = inputBaris(sc);

                // Input dan validasi kolom awal
                int kolomAwal = inputKolom(sc);

                // Input dan validasi baris akhir
                String barisAkhir = inputBaris(sc, barisAwal);

                // Input dan validasi kolom akhir
                int kolomAkhir = inputKolom(sc, kolomAwal);

                // Reservasi kursi pada blok
                reservasiBlokKursi(kursi, barisAwal, kolomAwal, barisAkhir, kolomAkhir);

                // Menampilkan peta kursi setelah reservasi
                tampilkanPetaKursi(kursi);

                // Keluar dari loop jika jumlah kursi sudah sesuai
                if (hitungJumlahKursiTerisi(kursi) >= bnykKursi) {
                    break;
                }
            }
        }

        sc.close(); // Tambahkan penutupan scanner
    }

    // Method untuk menampilkan peta kursi
    private static void tampilkanPetaKursi(String[][] kursi) {
        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                System.out.print(kursi[i][j] + " ");
            }
            System.out.println(); // Tambahkan baris baru setelah setiap baris kursi
        }
    }

    // Method untuk input dan validasi baris
    private static String inputBaris(Scanner sc) {
        String baris;
        do {
            System.out.print("Baris(A-E): ");
            baris = sc.next().toUpperCase(); // Ubah input menjadi uppercase
            if (baris.matches("[A-E]")) {
                break;
            } else {
                System.out.println("Input salah. Harap masukkan A, B, C, D, atau E.");
            }
        } while (true);
        return baris;
    }

    // Method untuk input dan validasi kolom
    private static int inputKolom(Scanner sc) {
        int kolom;
        do {
            System.out.print("Kolom(1-10): ");
            kolom = sc.nextInt() - 1;
            if (kolom >= 0 && kolom < 10) {
                break;
            } else {
                System.out.println("Input salah. Harap masukkan angka antara 1 dan 10.");
            }
        } while (true);
        return kolom;
    }

    // Method untuk input dan validasi baris dengan batasan berdasarkan baris awal
    private static String inputBaris(Scanner sc, String batasan) {
        String baris;
        do {
            System.out.print("Baris Akhir(A-E): ");
            baris = sc.next().toUpperCase(); // Ubah input menjadi uppercase
            if (baris.matches("[A-E]") && baris.charAt(0) >= batasan.charAt(0)) {
                break;
            } else {
                System.out.println("Input salah. Harap masukkan A, B, C, D, atau E, dan lebih besar atau sama dengan baris awal.");
            }
        } while (true);
        return baris;
    }

    // Method untuk input dan validasi kolom dengan batasan berdasarkan kolom awal
    private static int inputKolom(Scanner sc, int batasan) {
        int kolom;
        do {
            System.out.print("Kolom Akhir(1-10): ");
            kolom = sc.nextInt() - 1;
            if (kolom >= 0 && kolom < 10 && kolom >= batasan) {
                break;
            } else {
                System.out.println("Input salah. Harap masukkan angka antara 1 dan 10, dan lebih besar atau sama dengan kolom awal.");
            }
        } while (true);
        return kolom;
    }

    // Method untuk melakukan reservasi blok kursi
    private static void reservasiBlokKursi(String[][] kursi, String barisAwal, int kolomAwal, String barisAkhir, int kolomAkhir) {
        for (int i = barisAwal.charAt(0) - 'A'; i <= barisAkhir.charAt(0) - 'A'; i++) {
            for (int j = kolomAwal; j <= kolomAkhir; j++) {
                kursi[i][j] = " X"; // Reservasi kursi
            }
        }
    }

    // Method untuk menghitung jumlah kursi yang sudah terisi
    private static int hitungJumlahKursiTerisi(String[][] kursi) {
        int jumlahTerisi = 0;
        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                if (kursi[i][j].equals(" X")) {
                    jumlahTerisi++;
                }
            }
        }
        return jumlahTerisi;
    }
}