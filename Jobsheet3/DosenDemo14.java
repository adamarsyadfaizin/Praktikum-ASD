import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Dosen14[] daftarDosen = new Dosen14[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = input.nextLine();
            System.out.print("Nama          : ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jk = input.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = input.nextInt();
            input.nextLine();
            System.out.println("------------------------------");

            daftarDosen[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }

        DataDosen14.dataSemuaDosen(daftarDosen);
        DataDosen14.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen14.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen14.infoDosenPalingTua(daftarDosen);
        DataDosen14.infoDosenPalingMuda(daftarDosen);
    }
}
