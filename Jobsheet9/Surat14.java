public class Surat14 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    public Surat14(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public String toString() {
        return "ID: " + idSurat + ", Nama: " + namaMahasiswa + ", Kelas: " + kelas +
               ", Jenis Izin: " + jenisIzin + ", Durasi: " + durasi + " hari";
    }
}
