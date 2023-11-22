import java.util.HashMap;
import java.util.Scanner;

public class testing {

    static Scanner scanner = new Scanner(System.in);
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
            int choice = scanner.nextInt();

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
        String inputUsername = scanner.next();

        if (userCredentials.containsKey(inputUsername)) {
            System.out.println("Username sudah digunakan. Silakan pilih username lain.");
            return;
        }

        System.out.print("Masukkan password: ");
        String password = scanner.next();

        userCredentials.put(inputUsername, password);
        System.out.println("Registrasi berhasil. Selamat datang, " + inputUsername + "!");
        isLoggedIn = true;
        username = inputUsername;
    }

    static void login() {
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.next();

        if (userCredentials.containsKey(inputUsername)) {
            System.out.print("Masukkan password: ");
            String inputPassword = scanner.next();

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
    }
}
