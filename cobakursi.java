import java.util.Scanner;

public class cobakursi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ubahbaris = 0;
        String[][] kursi = {
            {"A1", "A2", "A3"},
            {"B1", "B2", "B3"}
        };

        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                System.out.print(kursi[i][j] + " ");
            }
            System.out.println(); // Tambahkan baris baru setelah setiap baris kursi
        }

        System.out.println("Pilih Kursi yang dipesan: ");
        System.out.print("Baris(A-B): ");
        String baris = sc.nextLine();
        System.out.print("Kolom(1-3): ");
        int kolom = sc.nextInt();

        if (baris.equalsIgnoreCase("A")) {
            ubahbaris = 0;
        }else if (baris.equalsIgnoreCase("B")) {
            ubahbaris += 1;
        } 

        kursi[ubahbaris][kolom] = "terisi";
        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                System.out.print(kursi[i][j] + " ");
            }
            System.out.println(); // Tambahkan baris baru setelah setiap baris kursi
        }
    }
}
