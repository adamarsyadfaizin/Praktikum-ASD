import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        StackTugasMahasiswa14 stack = new StackTugasMahasiswa14(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Lihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. lihat Tugas pertama");
            System.out.println("6. lihat jmlh tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa14 mhs = new Mahasiswa14(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa14 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.printf("Menilai tugas dari %s\n", dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa14 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.printf("Tugas terakhir dikumpulkan oleh %s\n", lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas:");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa14 bawah = stack.lihatTugasTerbawah();
                    if (bawah != null) {
                        System.out.printf(" pertama dikumpulkan oleh %s\n", bawah.nama);
                    }
                    break;
                case 6:
                    System.out.printf("Jumlah tugas yang telah dikumpulkan: %d\n", stack.jumlahTugas());
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 4);
    }
}
