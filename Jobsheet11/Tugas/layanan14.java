public class layanan14 {
    nodee14 depan, belakang;
    int jumlah;
    public layanan14() {
        depan = belakang = null;
        jumlah = 0;
    }
    public boolean kosong() {
        return depan == null;
    }
    public boolean penuh() {
        return false;
    }
    public void tambah(String nama) {
        nodee14 baru = new nodee14(nama);
        if (kosong()) {
            depan = belakang = baru;
        } else {
            belakang.next = baru;
            belakang = baru;
        }
        jumlah++;
        System.out.println(nama + "  masuk antrian");
    }
    public void panggil() {
        if (kosong()) {
            System.out.println("Antrian koson");
        } else {
            System.out.println("Memanggil: " + depan.nama);
            depan = depan.next;
            jumlah--;
            if (depan == null) belakang = null;
        }
    }
    public void tampilkanDepan() {
        if (!kosong()) {
            System.out.println("Antrian terdepan: " + depan.nama);
        } else {
            System.out.println("Antrian kosong");
        }
    }
    public void tampilkanBelakang() {
        if (!kosong()) {
            System.out.println("Antrian terakhir: " + belakang.nama);
        } else {
            System.out.println("Antrian kosong");
        }
    }
    public void tampilkanJumlah() {
        System.out.println("Jumlah mengantre: " + jumlah);
    }
    public void kosongkan() {
        depan = belakang = null;
        jumlah = 0;
        System.out.println("kosongkan");
    }
    public void tampilkanSemua() {
        if (kosong()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("mhs dlm anri : ");
            nodee14 bantu = depan;
            while (bantu != null) {
                System.out.println("- " + bantu.nama);
                bantu = bantu.next;
            }
        }
    }
}