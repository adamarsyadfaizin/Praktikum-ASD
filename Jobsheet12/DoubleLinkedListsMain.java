import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int pilih;

        do {
            System.out.println("==============================");
            System.out.println("Menu:");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Cetak data");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Insert data setelah NIM tertentu");
            System.out.println("7. Cari data berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (pilih) {
                case 1:
                case 2:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
                    if (pilih == 1) {
                        dll.addFirst(mhs);
                    } else {
                        dll.addLast(mhs);
                    }
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String key = sc.nextLine();
                    System.out.println("Masukkan data baru:");
                    System.out.print("NIM   : ");
                    nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    ipk = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    dll.insertAfter(key, new Mahasiswa14(nim, nama, kelas, ipk));
                    break;
                case 7:
                    System.out.print("Masukkan NIM yang dicari: ");
                    nim = sc.nextLine();
                    dll.search(nim);
                    break;
            }
        } while (pilih != 0);

        sc.close();
    }
}
