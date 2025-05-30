import java.util.Scanner;

public class main14 {
    public static void main(String[] args) {
        layanan14 ukm = new layanan14();
        Scanner sc = new Scanner(System.in);
        int pilih;
        String nama;

        do {
            System.out.println("layanan");
            System.out.println("1 Tambah antrian");
            System.out.println("2. Panggil antrian");
            System.out.println("3. Lihat terdepan");
            System.out.println("4. Lihat terakhir");
            System.out.println("5. Cek apakah antrian kosong");
            System.out.println("6. Kosongkan");
            System.out.println("7. jumlah");
            System.out.println("8. Tampil semua");
            System.out.println("0. Keluar");
            System.out.print("Pilih ");
            pilih = sc.nextInt(); sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("nama: ");
                    nama = sc.nextLine();
                    ukm.tambah(nama);
                    break;
                case 2:
                    ukm.panggil();
                    break;
                case 3:
                    ukm.tampilkanDepan();
                    break;
                case 4:
                    ukm.tampilkanBelakang();
                    break;
                case 5:
                    System.out.println(ukm.kosong() ? "Antrian kosong" : "ada antrian.");
                    break;
                case 6:
                    ukm.kosongkan();
                    break;
                case 7:
                    ukm.tampilkanJumlah();
                    break;
                case 8:
                    ukm.tampilkanSemua();
                    break;
                case 0:
                    System.out.println("degradasi yahaha hayuuk emyu gua kalah");
                    break;
                default:
                    System.out.println("tdk valid");
            }
        } while (pilih != 0);
    }
}
