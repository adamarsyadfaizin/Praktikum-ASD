import java.util.Scanner;

public class TugasNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = scanner.nextInt();
        scanner.nextLine();
        String[] daftarMatkul = new String[jumlahMatkul];
        int[] jumlahSKS = new int[jumlahMatkul];
        int[] semesterKuliah = new int[jumlahMatkul];
        String[] jadwalHari = new String[jumlahMatkul];
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            daftarMatkul[i] = scanner.nextLine();
            System.out.print("Jumlah SKS: ");
            jumlahSKS[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semesterKuliah[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            jadwalHari[i] = scanner.nextLine();
        }
        int pilihan;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal(daftarMatkul, jumlahSKS, semesterKuliah, jadwalHari);
                    break;
                case 2:
                    System.out.print("Masukkan hari yang ingin ditampilkan: ");
                    String hariDicari = scanner.nextLine();
                    cariJadwalBerdasarkanHari(daftarMatkul, jumlahSKS, semesterKuliah, jadwalHari, hariDicari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semesterDicari = scanner.nextInt();
                    tampilkanJadwalBerdasarkanSemester(daftarMatkul, jumlahSKS, semesterKuliah, jadwalHari, semesterDicari);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String matkulDicari = scanner.nextLine();
                    cariMataKuliah(daftarMatkul, jumlahSKS, semesterKuliah, jadwalHari, matkulDicari);
                    break;
                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
    public static void tampilkanSemuaJadwal(String[] matkul, int[] sks, int[] semester, String[] hari) {
        System.out.println("\nDaftar Jadwal Kuliah:");
        for (int i = 0; i < matkul.length; i++) {
            System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }
    public static void cariJadwalBerdasarkanHari(String[] matkul, int[] sks, int[] semester, String[] hari, String targetHari) {
        System.out.println("\nJadwal Kuliah pada hari " + targetHari + ":");
        boolean adaJadwal = false;
        for (int i = 0; i < matkul.length; i++) {
            if (hari[i].equalsIgnoreCase(targetHari)) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                adaJadwal = true;
            }
        }
        if (!adaJadwal) {
            System.out.println("Tidak ada kuliah di hari " + targetHari);
        }
    }
    public static void tampilkanJadwalBerdasarkanSemester(String[] matkul, int[] sks, int[] semester, String[] hari, int targetSemester) {
        System.out.println("\nJadwal Kuliah untuk Semester " + targetSemester + ":");
        boolean ditemukan = false;
        for (int i = 0; i < matkul.length; i++) {
            if (semester[i] == targetSemester) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah di semester " + targetSemester);
        }
    }
    public static void cariMataKuliah(String[] matkul, int[] sks, int[] semester, String[] hari, String dicari) {
        boolean ditemukan = false;
        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i].equalsIgnoreCase(dicari)) {
                System.out.println("\nDetail Mata Kuliah:");
                System.out.println("Nama: " + matkul[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari: " + hari[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
