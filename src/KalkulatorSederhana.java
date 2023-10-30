import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * KalkulatorSederhana adalah sebuah program Java sederhana untuk melakukan operasi matematika dasar.
 */

/**
 * @author Rifki 202210370311020
 */
public class KalkulatorSederhana {

    /**
     * Metode utama untuk menjalankan program kalkulator.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float angka1, angka2;
        int pilihan;

        System.out.print("Masukkan angka pertama: ");
        angka1 = scanner.nextFloat();
        System.out.print("Masukkan angka kedua: ");
        angka2 = scanner.nextFloat();

        System.out.println("Pilih operasi matematika:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1-4): ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.printf("Hasil penjumlahan: %.2f\n", penjumlahan(angka1, angka2));
                break;
            case 2:
                System.out.printf("Hasil pengurangan: %.2f\n", pengurangan(angka1, angka2));
                break;
            case 3:
                System.out.printf("Hasil perkalian: %.2f\n", perkalian(angka1, angka2));
                break;
            case 4:
                pembagian(angka1, angka2);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    /**
     * Metode untuk melakukan operasi penjumlahan.
     *
     * @param angka1 Angka pertama.
     * @param angka2 Angka kedua.
     * @return Hasil penjumlahan dari angka1 dan angka2.
     */
    public static float penjumlahan(float angka1, float angka2) {
        return angka1 + angka2;
    }

    /**
     * Metode untuk melakukan operasi pengurangan.
     *
     * @param angka1 Angka pertama.
     * @param angka2 Angka kedua.
     * @return Hasil pengurangan dari angka1 dan angka2.
     */
    public static float pengurangan(float angka1, float angka2) {
        return angka1 - angka2;
    }

    /**
     * Metode untuk melakukan operasi perkalian.
     *
     * @param angka1 Angka pertama.
     * @param angka2 Angka kedua.
     * @return Hasil perkalian dari angka1 dan angka2.
     */
    public static float perkalian(float angka1, float angka2) {
        return angka1 * angka2;
    }

    /**
     * Metode untuk melakukan operasi pembagian.
     * Jika angka2 bukan nol, hasil pembagian akan dicetak. Jika angka2 nol, pesan kesalahan akan dicetak.
     *
     * @param angka1 Angka pembilang.
     * @param angka2 Angka penyebut.
     */
    public static void pembagian(float angka1, float angka2) {
        if (angka2 != 0) {
            System.out.printf("Hasil pembagian: %.2f\n", angka1 / angka2);
        } else {
            System.out.println("Tidak dapat melakukan pembagian karena angka dibagi dengan nol.");
        }
    }
}