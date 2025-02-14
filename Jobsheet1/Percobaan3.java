import java.util.Scanner;

public class Percobaan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        double nilaiangka[] = new double[7];
        String nilaihuruf[] = new String[7];
        double bobotnilai[] = new double[7];
        double totalbobot = 0.0;
        String matkul[] = {"Pancasila","Konsep Teknologi Informasi","Critical Thingking dan Problem Solving","Matematika Dasar","Bahasa Inggris"
                            ,"Dasar Pemrograman","Praktikum Dasar Pemrograman","Keselamatan dan Kesehatan Kerja"};
        for(int i = 0;i < nilaiangka.length;i++) {
            System.out.print("masukkan nilai angka untuk MK " + matkul[i]+": ");
            nilaiangka[i] = sc.nextInt();
            if (nilaiangka[i] > 80) {
                nilaihuruf[i] = "A";
                bobotnilai[i] = 4.00;
            } else if (nilaiangka[i] > 73) {
                nilaihuruf[i] = "B+";
                bobotnilai[i] = 3.50;
            } else if (nilaiangka[i] > 65) {
                nilaihuruf[i] = "B";
                bobotnilai[i] = 3.00;
            } else if (nilaiangka[i] > 60) {
                nilaihuruf[i] = "C+";
                bobotnilai[i] = 2.50;
            } else if (nilaiangka[i] > 50) {
                nilaihuruf[i] = "C";
                bobotnilai[i] = 2.00;
            } else if (nilaiangka[i] > 39) {
                nilaihuruf[i] = "D";
                bobotnilai[i] = 1.00;
            } else if (nilaiangka[i] <= 39) {
                nilaihuruf[i] = "E";
                bobotnilai[i] = 0.00;
            }
        }
        System.out.println("======================");
        System.out.printf("\n%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("======================");
        for (int i = 0;i<bobotnilai.length;i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n",matkul[i],nilaiangka[i],nilaihuruf[i],bobotnilai[i]);
            totalbobot += bobotnilai[i];
        }
        double ip = totalbobot / matkul.length;
        System.out.println("======================");
        System.out.printf("IP : %.2f\n", ip);
    }
}