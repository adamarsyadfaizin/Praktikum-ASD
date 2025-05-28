import java.util.Scanner;

public class SuratDemo14 {
    public static void main(String[] args) {
        StackSurat14 stack14 = new StackSurat14(5);
        Scanner scan14 = new Scanner(System.in);
        int pilih14;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan nama mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih14 = scan14.nextInt();
            scan14.nextLine();
            switch (pilih14) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id14 = scan14.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama14 = scan14.nextLine();
                    System.out.print("Kelas: ");
                    String kelas14 = scan14.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis14 = scan14.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi14 = scan14.nextInt();
                    scan14.nextLine();
                    Surat14 surat14 = new Surat14(id14, nama14, kelas14, jenis14, durasi14);
                    stack14.push(surat14);
                    System.out.println("Surat berhasil diterima.");
                    break;
                case 2:
                    Surat14 proses14 = stack14.pop();
                    if (proses14 != null) {
                        System.out.println("Surat diproses: " + proses14);
                    }
                    break;

                case 3:
                    Surat14 lihat14 = stack14.peek();
                    if (lihat14 != null) {
                        System.out.println("Surat terakhir: " + lihat14);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari14 = scan14.nextLine();
                    boolean ditemukan14 = stack14.cariSurat(cari14);
                    if (ditemukan14) {
                        System.out.println("Surat izin ditemukan.");
                    } else {
                        System.out.println("Surat izin tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih14 != 5);
    }
}
