import java.util.Scanner;

public class DosenMain14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        DataDosen14 data14 = new DataDosen14(10);
        int pilihan14;
                    do {
                        System.out.println("======== Menu ========");
                        System.out.println("1. Tambah Data Dosen");
                        System.out.println("2. Tampilkan Data Dosen");
                        System.out.println("3. Urutkan Data (ASC) - Bubble Sort");
                        System.out.println("4. Urutkan Data (DESC) - Selection Sort");
                        System.out.println("5. Keluar");
                        System.out.print("Pilih menu: ");
                        pilihan14 = sc14.nextInt();
                        sc14.nextLine();
                        switch (pilihan14) {
                            case 1:
                        System.out.print("Masukkan kode: ");
                        String kode14 = sc14.nextLine();
                        System.out.print("Masukkan nama: ");
                        String nama14 = sc14.nextLine();
                        System.out.print("Masukkan jenis kelamin (true = Laki-laki, false = Perempuan): ");
                        boolean jk14 = sc14.nextBoolean();
                        System.out.print("Masukkan usia: ");
                        int usia14 = sc14.nextInt();
                        data14.tambah14(new Dosen14(kode14, nama14, jk14, usia14));
                        break;
        case 2:
                    data14.tampil14();
                    break;
            case 3:
                    data14.sortingASC14();
                    System.out.println("Data berhasil diurutkan ASCENDING.");
                    data14.tampil14();
                    break;
            case 4:
                        data14.sortingDSC14();
                        System.out.println("Data berhasil diurutkan DESCENDING.");
                        data14.tampil14();
                        break;
            case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan14 != 5);
    }
}