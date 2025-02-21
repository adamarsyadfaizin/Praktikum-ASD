import java.util.Scanner;

public class DosenMain14 {

    public static void main(String[] args) {
        Dosen14 dsn1 = new Dosen14();
        dsn1.idDosen = "1234";
        dsn1.nama = "adam";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2013;
        dsn1.bidangKeahlian = "Daspro";
        dsn1.setStatusAktif(true);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("CTPS");
        dsn1.tampilInformasi();

        System.out.println("\n");
        Dosen14 dsn2 = new Dosen14("4321","mada",true,2020,"BasisData",0);
        dsn2.setStatusAktif(false);
        dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Matematika Dasar");
        dsn2.tampilInformasi();
    }
}