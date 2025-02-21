import java.util.Scanner;

public class MataKuliahMain14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah14 objek1 = new MataKuliah14();
        objek1.kodeMK = "123";
        objek1.nama = "Adam";
        objek1.sks = 3;
        objek1.jumlahJam = 5;
        System.out.print("Ubah sks: ");
        int sksbru = sc.nextInt();
        objek1.ubahSKS(sksbru);
        System.out.print("Tambah jam: ");
        int tmbh = sc.nextInt();
        objek1.tambahJam(tmbh);
        System.out.print("Kurangi jam : ");
        int krng = sc.nextInt();
        objek1.kurangiJam(krng);
        objek1.tampilInformasi();

        System.out.println("\n");
        MataKuliah14 objek2 = new MataKuliah14("321","Arsyad",3,5);
        objek2.tampilInformasi();
    }
}