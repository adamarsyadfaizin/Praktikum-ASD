public class Dosen14 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    int masaKerja;

    public Dosen14() {

    }
    public Dosen14(String id, String nm, boolean sttus, int thnbergabung, String bidng, int mskerja) {
        idDosen = id;
        nama = nm;
        this.statusAktif = sttus;
        tahunBergabung = thnbergabung;
        bidng = bidangKeahlian;
        mskerja = masaKerja;
    }

    void tampilInformasi() {
        System.out.println("id dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status : " + statusAktif);
        System.out.println("tahun bergabung : " + tahunBergabung);
        System.out.println("bidang keahlian : " + bidangKeahlian);
        System.out.println("Lamanya masa kerja dosen " + masaKerja + " thn");
    }
    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        if (status == true) {
            System.out.println("Dosen tersebut aktif");
        } else {
            System.out.println("Dosen tersebut tidak aktif");
        }
    }
    int hitungMasaKerja(int thnSkrg) {
        masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }
    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
}