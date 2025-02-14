import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n===== menu perhitungan kubus =====");
            System.out.println("1. hitung volume kubus");
            System.out.println("2. hitung luas permukaan kubus");
            System.out.println("3. hitung keliling kubus");
            System.out.println("4. keluar");
            System.out.print("pilih menu: ");
            pilihan = scaner.nextInt();
            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("masukkan panjang sisi kubus: ");
                double sisi = scaner.nextDouble();
                switch (pilihan) {
                    case 1:
                        double volm = hitungvolme(sisi);
                        System.out.println("volume kubus: " + volm);
                        break;
                    case 2:
                        double luasprmukaan = hitungluaspermukaan(sisi);
                        System.out.println("luas permukaan kubus: " + luasprmukaan);
                        break;
                    case 3:
                        double kelilig = hitungkeliling(sisi);
                        System.out.println("keliling kubus: " + kelilig);
                        break;
                }
            } else if (pilihan != 4) {
                System.out.println("pilihan tidak valid, silahkan coba lagi.");
            }
        } while (pilihan != 4);
        System.out.println("program selesai.");
        scaner.close();
    }
    public static double hitungvolme(double s) {
        return s * s * s;
    }
    public static double hitungluaspermukaan(double s) {
        return 6 * (s * s);
    }
    public static double hitungkeliling(double s) {
        return 12 * s;
    }
}
