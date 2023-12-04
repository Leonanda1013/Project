import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class test123 {

    static Scanner sc = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    static boolean isLoggedIn = false;
    static boolean isMember = false;
    static boolean AdminUser = false;
    static String username, masuk;
    static HashMap<String, String> userCredentials = new HashMap<>();
    static Map<String, Integer> snacksPurchased = new HashMap<>();
    static Map<String, Integer> drinksPurchased = new HashMap<>();
    static int banyakFilm = 2;
    static String[] judulFilm = new String[banyakFilm];
    static int adminInput =10;
    static int adminBulan = 12;
    static int tahun = 2023;
    static int bnykKursi;
    static String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus","September", "Oktober", "November", "Desember"};
    static int hargaTiketTotal;
    static int keranjang;
    public static void main(String[] args) {
        System.out.println(
            "██╗   ██╗██╗███╗   ██╗██╗     ██╗   ██╗███╗   ██╗ █████╗      ██████╗██╗███╗   ██╗███████╗███╗   ███╗ █████╗ \r\n" + //
            "██║   ██║██║████╗  ██║██║     ██║   ██║████╗  ██║██╔══██╗    ██╔════╝██║████╗  ██║██╔════╝████╗ ████║██╔══██╗\r\n" + //
            "██║   ██║██║██╔██╗ ██║██║     ██║   ██║██╔██╗ ██║███████║    ██║     ██║██╔██╗ ██║█████╗  ██╔████╔██║███████║\r\n" + //
            "╚██╗ ██╔╝██║██║╚██╗██║██║     ██║   ██║██║╚██╗██║██╔══██║    ██║     ██║██║╚██╗██║██╔══╝  ██║╚██╔╝██║██╔══██║\r\n" + //
            " ╚████╔╝ ██║██║ ╚████║███████╗╚██████╔╝██║ ╚████║██║  ██║    ╚██████╗██║██║ ╚████║███████╗██║ ╚═╝ ██║██║  ██║\r\n" + //
            "  ╚═══╝  ╚═╝╚═╝  ╚═══╝╚══════╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═╝     ╚═════╝╚═╝╚═╝  ╚═══╝╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝\r\n" + //
            "                                                                                                             ");
        while (true) {
            System.out.println("██████████████████████████████████████");
            System.out.println("██                                  ██");
            System.out.println("██ Selamat datang di Vinluna Cinema ██");
            System.out.println("██                                  ██");
            System.out.println("██████████████████████████████████████");
            System.out.println();
            while (true) {

            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.print("Pilih Opsi (1 - 2) : ");
            
            int MenuUserAdmin = sc.nextInt();
            
             if (MenuUserAdmin==1) {
                
    
                while (true) {
                    System.out.println("1. Ubah Tanggal");
                    System.out.println("2. Ubah Film");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih yang ingin dirubah: ");
                    int pilihPerubahan = sc.nextInt();
        
                    if (pilihPerubahan == 1) {
                        ubahTanggal();
                    } else if (pilihPerubahan == 2) {
                        ubahFilmMenu();
                    } else if(pilihPerubahan==3){
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }

                    
                }
            }else if(MenuUserAdmin==2){
            while (true) {
                
            
            if (!isLoggedIn) {
                showMenuBelumLogin();
            } else {
                showMenuSudahLogin();
            }
        
            int choice = sc.nextInt();
            if(isLoggedIn){  //kalo isLoggedin true dia bakal nambah 2 karena showMenuSudahLogin untuk inputnya 
                            //selalu diambah 2 dari yang sebenarnya
                choice+=2;
            }
            switch (choice) {
                case 7:
                if (isLoggedIn) {
                    System.out.println("Rincian: ");
                

                }
                break;
                case 6:
                    if (isLoggedIn && !isMember) {
                        becomeMember();
                    } else if (isMember) {
                        System.out.println("Anda sudah menjadi member.");
                    } else {
                        System.out.println("Anda belum login.");
                    }
                    break;
                case 5:
                    if (isLoggedIn) {
                         beliSnackMinuman();
                    } else {
                        System.out.println("Anda belum login.");
                    }
                    break;
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
                        System.out.println("Apakah kamu siap? (y/n)");
                        masuk = sc.next();
        
                        int choiceFilm;
                        
                
                        System.out.println(" ");
                        System.out.println("Beli Tiket");
                        System.out.println(" ");
                
                        System.out.println("Daftar Film");
                        for (int i = 0; i < judulFilm.length; i++) {
                            System.out.println((i+1)+ " " + judulFilm[i]);
                        }
                        System.out.println(" ");
                
                        // Input film
                        while (true) {
                        System.out.print("Pilih Film Yang Anda Inginkan: ");
                        choiceFilm = sc.nextInt();
                        if (choiceFilm >= 1 && choiceFilm <= banyakFilm){
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

                        int inputTanggal;
                        int inputJam;
                
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
                                    System.out.println(j+1 +") "+ jam[j] + "                           " + (j+1) + ") "+ jam[j]);
                                }
                            
                            System.out.print("Pilih Studio(1/2): ");
                            int inpuStudio = sc.nextInt();
                            while (true) {
                            if (inpuStudio==1||inpuStudio==2) {
                               break;
                            }else {
                                 System.out.println("Studio tidak tersedia");
                                System.out.print("Pilih Studio(1/2): ");
                                inpuStudio = sc.nextInt();
                            }
                        }
                            System.out.print("Pilih jam yang anda inginkan(1-4): ");
                            inputJam = sc.nextInt();
                            while (true) {
                                if(inputJam>=1&&inputJam<=4){
                                    break;
                                }else{
                                    System.out.println("Pilihan Tidak Tersedia");
                                    System.out.print("Pilih jam yang anda inginkan(1-4): ");
                                    inputJam = sc.nextInt();
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
                
                        while (true) {
                            // Input jumlah kursi yang ingin diambil
                            System.out.print("Banyak kursi: ");
                            bnykKursi = sc.nextInt();
                
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
                
                            System.out.println("Apakah Kursi yang Anda Pilih Sudah Benar? (y/t) ");
                            String validasiKursi = sc.next();
                            if (validasiKursi.equalsIgnoreCase("y")) {
                                break;
                            } else if (validasiKursi.equalsIgnoreCase("t")) {
                                // Reset semua perubahan jika memilih kursi dibatalkan
                                ubahbaris = 0;
                                kursi = new String[][] {
                                    {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10"},
                                    {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"},
                                    {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10"},
                                    {"D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10"},
                                    {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10"},
                                };
                                continue;
                            } else {
                                System.out.println("Input salah. Silakan masukkan 'y' atau 't'.");
                                while (true) {
                                    System.out.println("Apakah Kursi yang Anda Pilih Sudah Benar? (y/t) ");
                                    validasiKursi = sc.next();
                                    if (validasiKursi.equalsIgnoreCase("y")||validasiKursi.equalsIgnoreCase("t")) {
                                        break;
                                    }
                                }
                            }
                            sc.close(); // Tambahkan penutupan scanner
                        }
                
                
                        //fitur pembyaran
                        System.out.println("1.Bayar sekarang");
                        System.out.println("2.Keranjang");
                        int masukBayar = sc.nextInt();
                        if (masukBayar==1) {
                            System.out.println("Metode pembayaran: ");
                            System.out.println("1. Transfer");
                            System.out.println("2. Debit");
                            System.out.print("Pilih metode pembayaran: ");
                            int metodeBayar = sc.nextInt();
                            String norek;
                            if (metodeBayar == 1 || metodeBayar == 2) {
                                hargaTiket();
                                System.out.println("Masukkan nomor rekening anda: ");
                                norek = scanner.nextLine();
                                validasiBayar(norek);
                            } else {
                                System.out.println("Metode pembayaran tidak valid.");
                            }
                        
                     
                        }else if(masukBayar==2){
                            System.out.println("Pesanan Telah Masuk pada Keranjang");
                            keranjang += hargaTiketTotal;
                            
                        }else{
                            System.out.println("Input Salah");
                        }
                
                        //Fitur cetak tiket
                        System.out.println(" ");
                    }
                }
            } 
        }
    }
        }
        }
        static void hargaTiket() {
            int hrgTiket = 25000;
             
            if (!isMember) {
                hargaTiketTotal = hrgTiket * bnykKursi;
                System.out.println("Harga tiket: " + hargaTiketTotal);
            } else {
                hargaTiketTotal = hrgTiket * bnykKursi * 90 / 100;
                System.out.println("Harga tiket: " + hargaTiketTotal);
            }
            
        }
    
        static void validasiBayar(String norek) {
            hargaTiket();
            System.out.println("No.rek: " + norek);
            System.out.println("Atas nama: " + username);
            System.out.print("Apakah anda yakin(y/n): ");
            String validasiMbayar = sc.next();
            if (validasiMbayar.equalsIgnoreCase("y")) {
                System.out.println("Terimakasih sudah membayar");
            } else {
                System.out.println("Pembayaran tidak berhasil. Silakan coba lagi.");
                validasiBayar(norek);  // Perulangan untuk meminta input nomor rekening kembali
            }
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

    
    
    static void AdminMenu(){
        System.out.println("1. Login");
    }
    static void showMenuBelumLogin() {
        System.out.println("1. Registrasi");
        System.out.println("2. Login");
        System.out.println("3. Keluar");
        System.out.print("Pilih Opsi (1 - 3) : ");
    }

    static void showMenuSudahLogin() {
        System.out.println("1. Logout");
        System.out.println("2. Beli Tiket");
        System.out.println("3. Beli Snack dan Minuman");
        System.out.println("4. Member");
        System.out.println("5. Rincian Pembayaran");
        System.out.println("6. Cetak Pembayaran");
        System.out.println("7. Keluar");
        System.out.print("Pilih opsi (1 - 7) : ");
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
        System.out.println();

        userCredentials.put(inputUsername, password);
        System.out.println("Registrasi berhasil. Selamat datang, " + inputUsername + "!");
        System.out.println();
        isLoggedIn = true;
        username = inputUsername;
    }

    static void login() {
        System.out.print("Masukkan username: ");
        String inputUsername = sc.next();

        if (userCredentials.containsKey(inputUsername)) {
            System.out.print("Masukkan password: ");
            String inputPassword = sc.next();
            System.out.println();

            String storedPassword = userCredentials.get(inputUsername);

            if (inputPassword.equals(storedPassword)) {
                System.out.println("Login berhasil. Selamat datang, " + inputUsername + "!");
                System.out.println();
                isLoggedIn = true;
                username = inputUsername;
            } else {
                System.out.println("Login gagal. Password tidak valid.");
            }
        } else {
            System.out.println("Login gagal. Username tidak ditemukan.");
        }
        }
        static void beliSnackMinuman() {
            System.out.println("Daftar Snack dan Minuman:");
            System.out.println("1. Popcorn - Rp. 15,000");
            System.out.println("2. Nachos - Rp. 12,000");
            System.out.println("3. Cola - Rp. 8,000");
            System.out.println("4. Mineral Water - Rp. 5,000");
    
            System.out.print("Pilih item (1-4): ");
            int snackChoice = sc.nextInt();
    
            System.out.print("Jumlah item yang dibeli: ");
            int quantity = sc.nextInt();
    
            switch (snackChoice) {
                case 1:
                    addToCart("Popcorn", 15000, quantity);
                    break;
                case 2:
                    addToCart("Nachos", 12000, quantity);
                    break;
                case 3:
                    addToCart("Cola", 8000, quantity);
                    break;
                case 4:
                    addToCart("Mineral Water", 5000, quantity);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    static String itemName;
    static int itemPrice, quantity;
        static void addToCart(String itemName, int itemPrice, int quantity) {
            int totalCost;
            if(!isMember){
         totalCost = itemPrice * quantity*90/100;
         System.out.println("Item berhasil ditambahkan ke keranjang: " + itemName);
            System.out.println("Harga per item: Rp. " + itemPrice);
            System.out.println("Jumlah item: " + quantity);
            System.out.println("Total biaya: Rp. " + totalCost);
            keranjang += totalCost;
            // Add the item to the respective cart
            if (itemName.equals("Popcorn") || itemName.equals("Nachos")) {
                snacksPurchased.put(itemName, snacksPurchased.getOrDefault(itemName, 0) + quantity);
            } else {
                drinksPurchased.put(itemName, drinksPurchased.getOrDefault(itemName, 0) + quantity);
            }
            }else {
                
            totalCost = itemPrice * quantity;
            System.out.println("Item berhasil ditambahkan ke keranjang: " + itemName);
            System.out.println("Harga per item: Rp. " + itemPrice);
            System.out.println("Jumlah item: " + quantity);
            System.out.println("Total biaya: Rp. " + totalCost);
            keranjang += totalCost;
            // Add the item to the respective cart
            if (itemName.equals("Popcorn") || itemName.equals("Nachos")) {
                snacksPurchased.put(itemName, snacksPurchased.getOrDefault(itemName, 0) + quantity);
            } else {
                drinksPurchased.put(itemName, drinksPurchased.getOrDefault(itemName, 0) + quantity);
            }

        }
            }
         static void becomeMember() {
            System.out.print("Ingin menjadi member? (y/n): ");
            char response = sc.next().charAt(0);        
            if (response == 'y' || response == 'Y') {
                isMember = true;
            System.out.println("Selamat! Anda sekarang menjadi member Vinluna Cinema.");
            System.out.println("Nikmati berbagai keuntungan dan diskon spesial.");
            } else {
                System.out.println("Terima kasih atas kunjungan Anda.");
            }
            
        }
        

            static void ubahTanggal() {
                System.out.print("Masukkan Tanggal untuk Pemutaran & hari ke depan: ");
                adminInput = sc.nextInt();
                System.out.print("Masukkan Bulan: ");
                adminBulan = sc.nextInt();
                System.out.print("Masukkan Tahun: ");
                tahun = sc.nextInt();
                int[] hari = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
                System.out.println("Tanggal pemutaran film yang akan tampil: ");
                for (int i = adminInput; i < adminInput + 7; i++) {
                    if (i <= hari[adminBulan - 1]) {
                        System.out.println(i + " " + (bulan[adminBulan-1]) + " " + tahun);
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