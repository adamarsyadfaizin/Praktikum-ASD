public class Mahasiswa14 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa14(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

   public void tampilInformasi() {
    System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
}

}
