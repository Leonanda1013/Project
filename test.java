import java.util.Scanner;
import java.util.HashMap;

public class test {

    static Scanner sc = new Scanner(System.in);
    static boolean isLoggedIn = false;
    static String username;
    static HashMap<String, String> userCredentials = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Selamat datang di Sistem Bioskop");

            if (!isLoggedIn) {
                showMenuBelumLogin();
            } else {
                showMenuSudahLogin();
            }

            System.out.print("Pilih opsi (1-5): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (!isLoggedIn) {
                        register();
                    } else {
                        System.out.println("Anda sudah login.");
                    }
                    break;
                case 2:
                    if (!isLoggedIn) {
                        login();
                    } else {
                        System.out.println("Anda sudah login.");
                    }
                    break;
                case 3:
                    if (isLoggedIn) {
                        System.out.println("Anda berhasil logout.");
                        isLoggedIn = false;
                    } else {
                        System.out.println("Anda belum login.");
                    }
                    break;
                case 4:
                    if (isLoggedIn) {
                        // Tambahkan fitur lainnya di sini untuk pengguna yang sudah login
                        System.out.println("Fitur ini masih dalam pengembangan.");
                    } else {
                        System.out.println("Anda harus login terlebih dahulu.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan Sistem Bioskop. Sampai jumpa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    static void showMenuBelumLogin() {
        System.out.println("1. Registrasi");
        System.out.println("2. Login");
        System.out.println("3. Keluar");
    }

    static void showMenuSudahLogin() {
        System.out.println("1. Registrasi (Anda sudah login)");
        System.out.println("2. Login (Anda sudah login)");
        System.out.println("3. Logout");
        System.out.println("4. Lihat Fitur Lain (Contoh)");
        System.out.println("5. Keluar");
    }

    static void register() {
        System.out.print("Masukkan username: ");
        String inputUsername = sc.next();

        if (userCredentials.containsKey(inputUsername)) {
            System.out.println("Username sudah digunakan. Silakan pilih username lain.");
            return;
        }

        System.out.print("Masukkan password: ");
        String password = sc.next();

        userCredentials.put(inputUsername, password);
        System.out.println("Registrasi berhasil. Selamat datang, " + inputUsername + "!");
        isLoggedIn = true;
        username = inputUsername;
    }

    static void login() {
        System.out.print("Masukkan username: ");
        String inputUsername = sc.next();

        if (userCredentials.containsKey(inputUsername)) {
            System.out.print("Masukkan password: ");
            String inputPassword = sc.next();

            String storedPassword = userCredentials.get(inputUsername);

            if (inputPassword.equals(storedPassword)) {
                System.out.println("Login berhasil. Selamat datang, " + inputUsername + "!");
                isLoggedIn = true;
                username = inputUsername;
            } else {
                System.out.println("Login gagal. Password tidak valid.");
            }
        } else {
            System.out.println("Login gagal. Username tidak ditemukan.");
        }
    
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
        while (true) {
        System.out.print("Pilih Film Yang Anda Inginkan: ");
        choiceFilm = sc.nextInt();
        if (choiceFilm == 2 || choiceFilm == 1) {
            System.out.println(" ");
            System.out.println("Film yang Anda pilih: " + judulFilm[choiceFilm - 1]);
            System.out.println(" ");
            break;
        } else {
            System.out.println("Film Tidak Tersedia");
        }
    }
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
        int inputTanggal;

        // Nanti nyambung dengan admin memasukkan tanggal berapa sekarang
        // Outputnya yang dikeluarkan akan sebanyak yang diinputkan admin
        for (int i = adminInput; i <= 6+adminInput; i++) {
            hari[i] = i ;
            
            System.out.println(i + " " + bulan[adminBulan - 1] + " " + tahun);
            
            }
        while (true) {
            
        System.out.println(" ");
        System.out.print("Pilih Tanggal (hari): ");
        inputTanggal = sc.nextInt();
        if(inputTanggal!= hari[inputTanggal]){
            System.out.println("tanggal yang anda masukkan tidak tersedia");
        
        } else{
        System.out.println(" ");
            break;
    }
}
         // Studio
            System.out.println("Studio 1:                         Studio 2: ");
                int banyakJamAdmin = 4;
                String[] jam = {"13.00", "16.00", "19.00", "21.00"};
                System.out.println("Jam Penayangan:                   Jam Penayangan:");
                for (int j = 0; j < banyakJamAdmin; j++) {
                    System.out.println(jam[j] + "                             "+ jam[j]);
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
        } else {//jika lebih dari dua
            
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
        //Inisialisasi dan deklarasi variable
        int tiket = 25000;
        int hargaTotal = bnykKursi*tiket;
        int metode;
        int norek;
        System.out.println(" ");
        System.out.println("Selamat datang di menu pembayaran");
        System.out.println(" ");

        System.out.println("Total : "+hargaTotal);
        System.out.println("Pilih metode pembayaran: ");
        System.out.println("1. Transfer bank ");
        System.out.println("2. Credit");
        System.out.println("3. Cash");
        metode = sc.nextInt();
        if (metode == 1) {
            System.out.println("");
        } else if (metode == 2) {
            System.out.println("Masukkan nomor rekening anda");
            norek = sc.nextInt();
        }else if(metode == 3){
            System.out.println("");
        }
            
        

        }

    }