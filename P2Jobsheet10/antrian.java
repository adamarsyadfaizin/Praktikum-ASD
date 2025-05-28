public class antrian {
    mahas[] data;
    int front, rear, size, max;
    int jumlahDiproses = 0;

    public antrian(int max) {
        this.max = max;
        data = new mahas[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(mahas mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa proses.");
            return;
        }
        for (int i = 0; i < 2; i++) {
            mahas m = data[front];
            System.out.print("Memproses KRS untuk: ");
            m.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
            return;
        }
        System.out.println("2 Antrian Terdepan:");
        for (int i = 0; i < 2; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void cetakJumlahProsesKRS() {
        System.out.println("Jumlah mahasiswa sudah proses KRS: " + jumlahDiproses);
    }

    public void cetakBelumKRS() {
        int sisa = 30 - jumlahDiproses;
        System.out.println("Jumlah mahasiswa belum proses KRS: " + sisa);
    }
}
