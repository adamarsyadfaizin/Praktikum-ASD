import java.util.Scanner;

public class MahasiswaMain14 {

    public static void main(String[] args) {
        Mahasiswa14 mhs1 = new Mahasiswa14();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa14 mhs2 = new Mahasiswa14("Annisa Nabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa14 mhsAdam = new Mahasiswa14("Moch. Adam Arsyad Faizin","244107020164",3.64,"TI 1B");
        mhsAdam.tampilkanInformasi();
    }
}