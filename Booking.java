 import java.util.Scanner;
public class Booking {
   


    public static void main(String[] args) {
        String[] usernames = new String[100]; // Maksimal 100 pengguna
        String[] passwords = new String[100];
        int userCount = 0; // Jumlah pengguna yang terdaftar
        int film;
        int banyaktiket = 0;
        String[] judulFilm = {"ppp","Budi Pekerti","Saranjana"};
        int filmChoice = 0;
        int pesan = 0;
        String tanggal = "";
        int waktuPilihan = 0;
        String[] waktuTayang = { "12:00", "15:00", "18:00", "21:00" };


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===================================");
            System.out.println(" Selamat Datang Di Cinema VinLuNa ");
            System.out.println("===================================");
            System.out.println("1. Login");
            System.out.println("2. Registrasi");
            System.out.println("3. Keluar");
            System.out.println("===================================");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter baru dari input

            if (choice == 1) {
                System.out.print("Masukkan nama pengguna: ");
                String inputUsername = scanner.nextLine();
                System.out.print("Masukkan kata sandi: ");
                String inputPassword = scanner.nextLine();

                boolean isAuthenticated = false;

                for (int i = 0; i < userCount; i++) {
                    if (inputUsername.equals(usernames[i]) && inputPassword.equals(passwords[i])) {
                        isAuthenticated = true;
                        break;
                    }
                }

                if (isAuthenticated) {
                    System.out.println("Login berhasil!");
                    System.out.println("============================");
                    System.out.println("       PEMILIHAN FILM");
                    int[][] theater = new int[5][10]; // Teater dengan 5 baris dan 10 kursi

        while (true) {
            System.out.println("============================");
            
            System.out.println("1. Pilih Film");
            System.out.println("2. Pilih Tanggal dan waktu");
            System.out.println("3. Pilih Kursi");
            System.out.println("4. Pembayaran");
            System.out.println("5. Kembali ke login");
            System.out.println("6. Cetak Pembayaran");
            System.out.println("============================");
            System.out.print("Pilihan Anda: ");
            int choice1 = scanner.nextInt();

            if (choice1 == 1) {
                System.out.println("Daftar Film:");
                System.out.println("1. Budi Pekerti");
                System.out.println("2. Saranjana");
                System.out.print("Pilih film (1 atau 2): ");
                filmChoice = scanner.nextInt();

                if (filmChoice == 1) {
                    System.out.println("Anda telah memilih Film Budi Pekerti.");
                } else if (filmChoice == 2) {
                    System.out.println("Anda telah memilih Saranjana.");
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            }else if(choice1 == 2){
                
                System.out.println("Waktu Tayang untuk " + judulFilm[filmChoice] + ":");
        for (int i = 0; i < waktuTayang.length; i++) {
            System.out.println((i + 1) + ". " + waktuTayang[i]);
        }

        // Meminta pengguna memilih waktu tayang
        System.out.print("Pilih nomor waktu tayang: ");
        
        waktuPilihan = scanner.nextInt();

        // Memeriksa apakah nomor waktu tayang yang dimasukkan valid
        if (waktuPilihan < 1 || waktuPilihan > waktuTayang.length) {
            System.out.println("Pilihan waktu tayang tidak valid.");
            return;
        }

        // Meminta pengguna memasukkan tanggal
        System.out.print("Masukkan tanggal (DD-MM-YYYY): ");
        tanggal = scanner.next();
            
    } else if (choice1 == 3) {
                System.out.println("Banyak Kursi yang dipesan:");
                pesan = scanner.nextInt();
                for (int l = 0; l < pesan; l++) {
                            System.out.println("Teater:");

                            for (int i = 0; i < theater.length; i++) {
                                for (int j = 0; j < theater[i].length; j++) {
                                    if (theater[i][j] == 0) {
                                        System.out.print("O "); // Kursi kosong
                                    } else {
                                        System.out.print("X "); // Kursi terisi
                                    }
                                }
                                System.out.println();
                            }

                            System.out.print("Pilih baris (1-5): ");
                            int row = scanner.nextInt() - 1;

                            System.out.print("Pilih kursi (1-10): ");
                            int seat = scanner.nextInt() - 1;

                            if (row >= 0 && row < theater.length && seat >= 0 && seat < theater[row].length) {
                                if (theater[row][seat] == 0) {
                                    theater[row][seat] = 1;
                                    System.out.println("Kursi berhasil dipilih!");
                                } else {
                                    System.out.println("Kursi sudah terisi. Pilih kursi lain.");
                                }
                        
                            } else {
                                System.out.println("Baris atau kursi tidak valid.");
                                 }
                            }
            } else if (choice1 == 4) {
                System.out.println("Selamat datang di Sistem Pemesanan Tiket Bioskop!");

                        // Pemilihan tanggal dan film
                        // ...

                        // Pemilihan kursi
                        // ...

                        // Harga tiket (di sini kita mengasumsikan harga tetap)
                        double ticketPrice = 25000;

                        // Jumlah tiket yang dibeli
                        System.out.print("Masukkan jumlah tiket yang dibeli: ");
                        int numberOfTickets = scanner.nextInt();

                        // Total harga
                        double totalPrice = ticketPrice * numberOfTickets;

                        System.out.println("Total Harga Tiket: RP" + totalPrice);

                        // Metode pembayaran (contoh sederhana)
                        System.out.print("Pilih metode pembayaran (1: Kartu Kredit, 2: Uang Tunai): ");
                        int paymentMethod = scanner.nextInt();

                        if (paymentMethod == 1) {
                            // Pembayaran dengan kartu kredit
                            System.out.print("Masukkan nomor kartu kredit: ");
                            String creditCardNumber = scanner.next();

                            // Proses pembayaran dengan kartu kredit
                            // ...

                            System.out.println("Pembayaran dengan kartu kredit berhasil.");
                        } else if (paymentMethod == 2) {
                            // Pembayaran dengan uang tunai
                            System.out.print("Masukkan jumlah uang tunai: Rp");
                            double cashAmount = scanner.nextDouble();

                            if (cashAmount >= totalPrice) {
                                // Proses pembayaran dengan uang tunai
                                // ...

                                System.out.println("Pembayaran dengan uang tunai berhasil.");
                            } else {
                                System.out.println("Jumlah uang tunai tidak mencukupi.");
                            }
                        } else {
                            System.out.println("Metode pembayaran tidak valid.");
                        }
                    
                        // Tiket berhasil dipesan
                        System.out.println("Tiket Anda telah berhasil dipesan!");
            } else if (choice1==5){
                System.out.println("");
                System.out.println("");
                System.out.println("===Login===");
                break;
                
            } else if (choice1==6){
                System.out.println("===== Struk Pembayaran =====");
                System.out.println("Nama Pemesanan : " + inputUsername);
                System.out.println("Nama Film : "+ judulFilm[filmChoice]);
                System.out.println("Tanggal : "+ tanggal );
                System.out.println("Waktu : "+ waktuTayang[waktuPilihan]);
                System.out.println("Jumlah Tiket : "+ pesan);
                System.out.println("");
                break;
            
        }
        }
                } else {
                    System.out.println("Login gagal. Nama pengguna atau kata sandi salah.");
                }
            } else if (choice == 2) {
                if (userCount < usernames.length) {
                    System.out.print("Masukkan nama pengguna baru: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Masukkan kata sandi baru: ");
                    String newPassword = scanner.nextLine();

                    usernames[userCount] = newUsername;
                    passwords[userCount] = newPassword;
                    userCount++;

                    System.out.println("Registrasi berhasil!");
                } else {
                    System.out.println("Batas maksimum pengguna tercapai. Tidak dapat mendaftar lebih banyak.");
                }
            } else if (choice == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}
