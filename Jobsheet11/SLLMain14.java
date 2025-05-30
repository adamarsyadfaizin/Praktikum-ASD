import java.util.Scanner;

public class SLLMain14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        SingledLinkedList14 sll = new SingledLinkedList14();
        Mahasiswa14[] d = new Mahasiswa14[4];
        for (int i = 0; i < d.length; i++) {
            System.out.println("Mhs " + (i + 1) + ": ");
            System.out.print("nim ");
            String nim = sc14.nextLine();
            System.out.print("nma ");
            String nama = sc14.nextLine();
            System.out.print("kls ");
            String kelas = sc14.nextLine();
            System.out.print("ipk");
            double ipk = sc14.nextDouble();
            sc14.nextLine(); 
            d[i] = new Mahasiswa14(nim, nama, kelas, ipk);
        }

        sll.print();
        sll.addFirst(d[0]);
        sll.print();
        sll.addLast(d[1]);
        sll.print();
        sll.insertafter("Dirga", d[2]);
        sll.insertat(2, d[3]);
        sll.print();

        System.out.println("data index 1:");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
