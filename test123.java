import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class test123 {

    static Scanner sc = new Scanner(System.in);
    static boolean isLoggedIn = false;
    static boolean isMember = false;
    static String username;
    static HashMap<String, String> userCredentials = new HashMap<>();
    static Map<String, Integer> snacksPurchased = new HashMap<>();
    static Map<String, Integer> drinksPurchased = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("██ Selamat datang di Vinluna Cinema ██");

            if (!isLoggedIn) {
                showMenuBelumLogin();
            } else {
                showMenuSudahLogin();
            }

            System.out.print("Pilih opsi (1-9): ");
            int choice = sc.nextInt();

            switch (choice) {
                // ... (existing cases)

                case 6:
                    if (isLoggedIn && !isMember) {
                        becomeMember();
                    } else if (isMember) {
                        System.out.println("Anda sudah menjadi member.");
                    } else {
                        System.out.println("Anda belum login.");
                    }
                    break;

                // ... (existing cases)

            }
        }
    }

    // ... (existing methods)

    static void showMenuSudahLogin() {
        // ... (existing menu options)
        System.out.println("6. Member");
        // ... (remaining menu options)
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
}
