public class Dosen14 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen14(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Jenis Kelamin: " 
            + (jenisKelamin ? "Laki-laki" : "Perempuan") + ", Usia: " + usia);
    }
}