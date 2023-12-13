import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class test {

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
    static int adminInput = 10;
    static int adminBulan = 12;
    static int tahun = 2023;
    static int bnykKursi;
    static String[] bulan = { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September",
            "Oktober", "November", "Desember" };
    static int hargaTiketTotal;
    static int choiceFilm;
    static int totalCost;
    static int inpuStudio;
    static String[] jam = { "13.00", "16.00", "19.00", "21.00" };
    static int inputJam;
    static int keranjang = 0;
    static boolean isTiketKeranjang = false;
    static boolean isSnackKeranjang = false;
    static boolean isPesanKeranjang = false;
    static String itemName;
    static int itemPrice, quantity;
    static boolean fiturKeranjang;
    static boolean fiturSnack;
    static boolean sudahBayar = false;
    static boolean sudahBayarTiket = false;
    static boolean sudahBayarSnack = false;
    static boolean fiturTiket;
    static int jumlahTerisi;
    static int bnykTambahan;
    static boolean Keluar;

    public static void main(String[] args) {
        while (true) {
            if (Keluar) {
                Keluar = false;
                break;

            }
            if (!isLoggedIn) {
                showMenuBelumLogin();
            } else {
                showMenuSudahLogin();
            }

            int choice = sc.nextInt();
            if (isLoggedIn) { // kalo isLoggedin true dia bakal nambah 2 karena showMenuSudahLogin untuk
                              // inputnya
                              // selalu diambah 2 dari yang sebenarnya
                choice += 3;
            }
            switch (choice) {
                case 3:
                    if (!isLoggedIn) {
                        System.out.println("");
                        Keluar = true;
                        break;

                    }

                case 10:
                    if (isLoggedIn) {
                        isLoggedIn = false;
                        break;
                    }
                case 7:
                    if (isLoggedIn) {
                        fiturKeranjang = true;
                        System.out.println("Rincian: ");
                        if (isTiketKeranjang) {

                            System.out.println("\nBELI TIKET");
                            System.out.println("Judul Film : " + judulFilm[choiceFilm - 1]);
                            System.out.println("Studio : " + inpuStudio);
                            System.out.println("Jam : " + jam[inputJam - 1]);
                            System.out.println("Jumlah Kursi : " + bnykKursi);
                            hargaTiket();
                        }
                        if (isSnackKeranjang) {

                            System.out.println("\nBeli Snack dan Minum : ");
                            System.out.println("Item berhasil ditambahkan ke keranjang : " + itemName);
                            System.out.println("Harga per Item : Rp." + itemPrice);
                            System.out.println("Jumlah Item : " + quantity);
                            System.out.println("Total Biaya : Rp." + totalCost);
                        }
                        if (isTiketKeranjang || isSnackKeranjang) {
                            if (!sudahBayarSnack) {
                                keranjang = totalCost;
                            }
                            if (!sudahBayarTiket) {
                                keranjang = hargaTiketTotal;
                            }
                            if (!sudahBayarSnack && !sudahBayarTiket) {
                                keranjang = hargaTiketTotal + totalCost;
                            }
                            System.out.println("Total : Rp." + keranjang);

                            System.out.println("\n[1] Bayar" + "\n[2] Keluar");
                            System.out.println("Silahkan pilih opsi anda (1 - 2) : ");
                            int case7 = sc.nextInt();
                            while (true) {

                                if (case7 == 1) {
                                    pembayaranLangsung();
                                    sudahBayar = true;
                                    if (fiturSnack) {
                                        sudahBayarSnack = true;
                                    }
                                    if (fiturTiket) {
                                        sudahBayarTiket = true;
                                    }

                                    break;
                                } else if (case7 == 2) {
                                    break;
                                } else {
                                    System.out.println("\nPilihan tidak ada\n");
                                }

                            }

                        } else {
                            System.out.println(" ");
                            System.out.println("Tidak ada Item di Keranjang");
                            System.out.println(" ");
                        }
                    }
                    break;
    }
}