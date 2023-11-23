import java.util.HashMap;
import java.util.Map;

public class FrekuensiAngka {
    public static void main(String[] args) {
        int[] angka = {70, 50, 68, 75, 43, 85, 81, 63,
                       79, 49, 48, 74, 81, 98, 87, 80,
                       80, 84, 90, 70, 91, 93, 82, 78,
                       70, 71, 92, 38, 56, 91, 74, 73,
                       68, 72, 85, 53, 65, 93, 83, 86,
                       90, 32, 83, 73, 74, 43, 86, 68,
                       92, 93, 76, 71, 90, 72, 67, 75,
                       80, 91, 61, 72, 97, 91, 88, 81,
                       70, 74, 99, 95, 80, 59, 71, 77,
                       63, 60, 83, 82, 60, 67, 89, 63,
                       76, 63, 88, 70, 66, 80, 79, 75};

        // Hitung jumlah data
        int jumlahData = angka.length;

        // Hitung rentang data
        int nilaiTerkecil = Integer.MAX_VALUE;
        int nilaiTerbesar = Integer.MIN_VALUE;

        for (int nilai : angka) {
            nilaiTerkecil = Math.min(nilaiTerkecil, nilai);
            nilaiTerbesar = Math.max(nilaiTerbesar, nilai);
        }

        int rentangData = nilaiTerbesar - nilaiTerkecil;

        // Hitung kelas interval menggunakan rumus Sturges
        double kelasInterval = 1 + 3.322 * Math.log10(jumlahData);
        int k = (int) Math.ceil(kelasInterval);

        // Hitung lebar interval
        int lebarInterval = (int) Math.ceil((double) rentangData / k);

        // Buat objek untuk menyimpan frekuensi
        Map<String, Integer> frekuensi = new HashMap<>();

        // Iterasi melalui array dan hitung frekuensi kelompok
        for (int nilai : angka) {
            int kelas = ((nilai - nilaiTerkecil) / lebarInterval) + 1;
            String kelasKey = String.format("%d - %d", nilaiTerkecil + (kelas - 1) * lebarInterval,
                    nilaiTerkecil + kelas * lebarInterval - 1);

            frekuensi.put(kelasKey, frekuensi.getOrDefault(kelasKey, 0) + 1);
        }

        // Tampilkan hasil
        for (Map.Entry<String, Integer> entry : frekuensi.entrySet()) {
            System.out.println("Kelas " + entry.getKey() + ": " + entry.getValue() + " data");
        }
    }
}
