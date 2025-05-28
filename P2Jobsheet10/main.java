import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrian antri = new antrian(10);
        int pilih;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Belakang");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Mahasiswa yang Sudah KRS");
            System.out.println("8. Cetak Jumlah Mahasiswa yang Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    mahas mhs = new mahas(nim, nama, prodi, kelas);
                    antri.tambahAntrian(mhs);
                    break;
                case 2:
                    antri.prosesKRS();
                    break;
                case 3:
                    antri.tampilkanSemua();
                    break;
                case 4:
                    antri.lihatDuaTerdepan();
                    break;
                case 5:
                    antri.lihatAkhir();
                    break;
                case 6:
                    antri.cetakJumlahAntrian();
                    break;
                case 7:
                    antri.cetakJumlahProsesKRS();
                    break;
                case 8:
                    antri.cetakBelumKRS();
                    break;
                case 9:
                    antri.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak ada.");
            }

        } while (pilih != 0);
    }
}
