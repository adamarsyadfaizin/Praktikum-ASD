public class MataKuliah14 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    public MataKuliah14() {

    }
    public MataKuliah14(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("sks : " + sks);
        System.out.println("Jumlah jam : " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS Telah diubah menjadi " + sksBaru + " SKS");
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
        jumlahJam -= jam;
        }
    }
}