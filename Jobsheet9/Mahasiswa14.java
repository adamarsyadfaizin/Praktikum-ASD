public class Mahasiswa14 {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa14(String nama, String nim, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", Nilai: " + nilai;
    }
}
