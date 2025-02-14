import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {
        char[] kodePlat = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] namaKota = {"Banten","Jakarta","Bandung",
            "Cirebon",
            "Bogor","Pekalongan",
            "Semarang",
            "Surabaya",
            "Malang",
            "Tegal"
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char kodeMasuk = input.next().toUpperCase().charAt(0);
        boolean ditemukan = false;
        for (int i = 0; i < kodePlat.length; i++) {
            if (kodePlat[i] == kodeMasuk) {
                System.out.println("Kota: " + namaKota[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
