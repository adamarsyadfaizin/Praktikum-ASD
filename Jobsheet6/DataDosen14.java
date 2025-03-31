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
}