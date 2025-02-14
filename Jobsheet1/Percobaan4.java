public class Percobaan4 {
    static int[][] stokCabang = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}    
    };
    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static int[] bungaRusak = {-1, -2, 0, -5}; 
    public static void main(String[] args) {
        hitungPendapatan();
        tampilkanTotalStok();
        perbaruiStokSetelahRusak();
        tampilkanTotalStok();
    }
    public static void hitungPendapatan() {
        System.out.println("semua capang terjual:");
        for (int i = 0; i < stokCabang.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stokCabang[i].length; j++) {
                totalPendapatan += stokCabang[i][j] * hargaBunga[j];
            }
            System.out.println("TokoBunga " + (i + 1) + ": Rp " + totalPendapatan);
        }
    }
    public static void tampilkanTotalStok() {
        int[] totalStokBunga = new int[4];
        for (int i = 0; i < stokCabang.length; i++) {
            for (int j = 0; j < stokCabang[i].length; j++) {
                totalStokBunga[j] += stokCabang[i][j];
            }
        }
        System.out.println("\nstok bunga saat ini:");
        System.out.println("Aglonema: " + totalStokBunga[0]);
        System.out.println("Keladi  : " + totalStokBunga[1]);
        System.out.println("Alocasia: " + totalStokBunga[2]);
        System.out.println("Mawar   : " + totalStokBunga[3]);
    }
    public static void perbaruiStokSetelahRusak() {
        System.out.println("\nbeberapa bunga rusak");
        for (int i = 0; i < stokCabang.length; i++) {
            for (int j = 0; j < stokCabang[i].length; j++) {
                stokCabang[i][j] += bungaRusak[j];
                if (stokCabang[i][j] < 0) stokCabang[i][j] = 0;
            }
        }
    }
}
