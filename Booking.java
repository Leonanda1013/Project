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
        int adminInput = 4;
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
    
        //Fitur Pemilihan Kursi
       // Deklarasi Variabel
        int ubahbaris = 0;
        String[][] kursi = {
            {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10"},
            {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"},
            {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"},
            {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"},
            {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"},
        };

        System.out.println("Banyak kursi: ");
        int bnykKursi = sc.nextInt();

        if (bnykKursi <=2) {
            for (int k = 0; k < bnykKursi; k++) {
            for (int i = 0; i < kursi.length; i++) {
                for (int j = 0; j < kursi[i].length; j++) {
                    System.out.print(kursi[i][j] + " ");
                }
                System.out.println(); // Tambahkan baris baru setelah setiap baris kursi
            }

            // Input baris dan validasi
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

            // Input kolom dan validasi
            int kolom;
            do {
                System.out.print("Kolom(1-10): ");
                kolom = sc.nextInt() - 1;
                if (kolom >= 0 && kolom < 10) {
                    if (kursi[baris.charAt(0) - 'A'][kolom].equals(" X")) {
                        System.out.println("Kursi sudah diambil. Pilih kursi lain.");
                        System.out.print("Baris(A-E): ");
                        baris = sc.next().toUpperCase(); // Ubah input menjadi uppercase
                        System.out.print("Kolom(1-10): ");
                        kolom = sc.nextInt() - 1;
                        if (baris.matches("[A-E]")) {
                            break;
                        } else {
                            System.out.println("Input salah. Harap masukkan A, B, C, D, atau E.");
                        }
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Input salah. Harap masukkan angka antara 1 dan 10.");
                }
            } while (true);

            ubahbaris = baris.charAt(0) - 'A'; // Konversi baris ke indeks array

            kursi[ubahbaris][kolom] = " X";

            if (k == bnykKursi - 1) {
                for (int i = 0; i < kursi.length; i++) {
                    for (int j = 0; j < kursi[i].length; j++) {
                        System.out.print(kursi[i][j] + " ");
                    }
                    System.out.println(); // Tambahkan baris baru setelah setiap baris kursi
                }
            }
        }
        } else {//jika
            for (int k = 0; k < bnykKursi; k++) {
                for (int i = 0; i < kursi.length; i++) {
                    for (int j = 0; j < kursi[i].length; j++) {
                        System.out.print(kursi[i][j] + " ");
                    }
                    System.out.println(); // Tambahkan baris baru setelah setiap baris kursi
                }

                // Input baris awal dan validasi
                String barisAwal;
                do {
                    System.out.print("Baris Awal(A-E): ");
                    barisAwal = sc.next().toUpperCase(); // Ubah input menjadi uppercase
                    if (barisAwal.matches("[A-E]")) {
                        break;
                    } else {
                        System.out.println("Input salah. Harap masukkan A, B, C, D, atau E.");
                    }
                } while (true);

                // Input kolom awal dan validasi
                int kolomAwal;
                do {
                    System.out.print("Kolom Awal(1-10): ");
                    kolomAwal = sc.nextInt() - 1;
                    if (kolomAwal >= 0 && kolomAwal < 10) {
                        break;
                    } else {
                        System.out.println("Input salah. Harap masukkan angka antara 1 dan 10.");
                    }
                } while (true);

                // Input baris akhir dan validasi
                String barisAkhir;
                do {
                    System.out.print("Baris Akhir(A-E): ");
                    barisAkhir = sc.next().toUpperCase(); // Ubah input menjadi uppercase
                    if (barisAkhir.matches("[A-E]") && barisAkhir.charAt(0) >= barisAwal.charAt(0)) {
                        break;
                    } else {
                        System.out.println("Input salah. Harap masukkan A, B, C, D, atau E, dan lebih besar atau sama dengan baris awal.");
                    }
                } while (true);

                // Input kolom akhir dan validasi
                int kolomAkhir;
                do {
                    System.out.print("Kolom Akhir(1-10): ");
                    kolomAkhir = sc.nextInt() - 1;
                    if (kolomAkhir >= 0 && kolomAkhir < 10 && kolomAkhir >= kolomAwal) {
                        break;
                    } else {
                        System.out.println("Input salah. Harap masukkan angka antara 1 dan 10, dan lebih besar atau sama dengan kolom awal.");
                    }
                } while (true);

                // Reservasi kursi pada bloc
                for (int i = barisAwal.charAt(0) - 'A'; i <= barisAkhir.charAt(0) - 'A'; i++) {
                    for (int j = kolomAwal; j <= kolomAkhir; j++) {
                        kursi[i][j] = " X";
                    }
                }

                // Menampilkan kursi setelah reservasi
                for (int i = 0; i < kursi.length; i++) {
                    for (int j = 0; j < kursi[i].length; j++) {
                        System.out.print(kursi[i][j] + " ");
                    }
                    System.out.println(); // Tambahkan baris baru setelah setiap baris kursi
                }
            }
        }







        // Fitur Pembayaran
        
        }


        
    }


