public class DataDosen14 {
    Dosen14[] dataDosen14;
    int idx14;
    public DataDosen14(int jumlah14) {
        dataDosen14 = new Dosen14[jumlah14];
        idx14 = 0;
    }
        public void tambah14(Dosen14 dsn14) {
            if (idx14 < dataDosen14.length) {
                dataDosen14[idx14] = dsn14;
                idx14++;
            } else {
                System.out.println("Data penuh!");
            }
        }
            public void tampil14() {
            for (int i = 0; i < idx14; i++) {
                dataDosen14[i].tampil();
            }
        }
    public void sortingASC14() {
        for (int i = 0; i < idx14 - 1; i++) {
            for (int j = 0; j < idx14 - i - 1; j++) {
                if (dataDosen14[j].usia > dataDosen14[j + 1].usia) {
                    Dosen14 temp14 = dataDosen14[j];
                    dataDosen14[j] = dataDosen14[j + 1];
                    dataDosen14[j + 1] = temp14;
                }
            }
        }
    }
            public void sortingDSC14() {
        for (int i = 0; i < idx14 - 1; i++) {
            int maxIdx14 = i;
            for (int j = i + 1; j < idx14; j++) {
                if (dataDosen14[j].usia > dataDosen14[maxIdx14].usia) {
                    maxIdx14 = j;
                }
            }
                    Dosen14 temp14 = dataDosen14[maxIdx14];
                    dataDosen14[maxIdx14] = dataDosen14[i];
                    dataDosen14[i] = temp14;
                }
    }
    int PencarianDataSquential14(String cari) {
        int posisi = -1;
        for (int j=0;j<dataDosen14.length;j++) {
            if (dataDosen14[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public int binarySearchUsia14(int usiaCari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (dataDosen14[mid].usia == usiaCari) {
                return mid;
            } else if (dataDosen14[mid].usia > usiaCari) {
                return binarySearchUsia(usiaCari, left, mid - 1);
            } else {
                return binarySearchUsia(usiaCari, mid + 1, right);
            }
        }
        return -1;
    }
    public void tampilDosenUsiaSama(int usia) {
        int count = 0;
        for (int i = 0; i < idx14; i++) {
            if (dataDosen14[i].usia == usia) {
                dataDosen14[i].tampil();
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Terdapat " + count + " dosen dengan usia " + usia);
        } else if (count == 1) {
            System.out.println("Terdapat 1 dosen dengan usia " + usia);
        } else {
            System.out.println("Tidak ditemukan dosen dengan usia " + usia);
        }
    }
    
    void tampilDataSearch(String x,int pos) {
        if (pos!=-1) {
            System.out.println("kode: " + dataDosen14.kode);
            System.out.println("nama: " + dataDosen14.nama);
            System.out.println("Jenis Kelamin: " + (dataDosen14.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("usia: " + dataDosen14.usia);
        }
    }
    void tampilPosisi(String x,int pos) {
        if (x != -1) { 
            System.out.println("data Dosen dengan nama: " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("data dosen tidak ditemukan");
        }
    }
}