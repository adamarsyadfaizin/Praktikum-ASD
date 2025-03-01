import java.util.Scanner;

public class MatakuliahDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());

        Matakuliah14[] arrayOfMatakuliah = new Matakuliah14[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah14();
            arrayOfMatakuliah[i].tambahData();
        }

        System.out.println("\n===== DATA MATAKULIAH =====");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
