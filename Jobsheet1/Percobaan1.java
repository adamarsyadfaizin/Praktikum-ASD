import java.util.Scanner;

public class Percobaan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        double Ntgs = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        double Nkuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        double Nuts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        double Nuas = sc.nextInt();
        double Nakhir = (Ntgs * 0.20) + (Nkuis * 0.20) + (Nuas * 0.30) + (Nuts * 0.30);
        if (Ntgs < 0 || Ntgs > 100 || Nkuis < 0 || Nkuis > 100 || Nuts < 0 || Nuts > 100 || Nuas < 0 || Nuas > 100) {
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        } else {
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("nilai akhir : " + Nakhir);
        if (Nakhir > 80) {
            System.out.println("Nilai Huruf :A");
        } else if (Nakhir > 73) {
            System.out.println("Nilai Huruf:B+");
        } else if (Nakhir > 65) {
            System.out.println("Nilai Huruf :B");
        } else if (Nakhir > 60) {
            System.out.println("Nilai Huruf:C+");
        } else if (Nakhir > 50) {
            System.out.println("Nilai Huruf:C");
        } else if (Nakhir > 39) {
            System.out.println("Nilai Huruf:D");
        } else if (Nakhir < 39) {
            System.out.println("Nilai Huruf:E");
        }
        System.out.println("======================");
        System.out.println("======================");
        if (Nakhir > 50) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (Nakhir < 50) {
            System.out.println("TIDAK LULUS");
        }
    }
    }
}