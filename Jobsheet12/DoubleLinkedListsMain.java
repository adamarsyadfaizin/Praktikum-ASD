import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int pilih;

        do {
            System.out.println("==============================");
            System.out.println("Menu:");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Hapus data pertama");
            System.out.println("4. Hapus data terakhir");
            System.out.println("5. Cetak data");
            System.out.println("6. Cari data berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); // consume newline

            switch (pilih) {
                case 1 -> {
                    Mahasiswa14 mhs = inputMahasiswa(scan);
                    dll.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa14 mhs = inputMahasiswa(scan);
                    dll.addLast(mhs);
                }
                case 3 -> dll.removeFirst();
                case 4 -> dll.removeLast();
                case 5 -> dll.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node14 found = dll.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        scan.close();
    }

    public static Mahasiswa14 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble(); scan.nextLine();
        return new Mahasiswa14(nim, nama, kelas, ipk);
    }
}
