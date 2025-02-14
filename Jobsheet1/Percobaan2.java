import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("2 digit terakhir nim: ");
        int n = input.nextInt();
        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; 
            }
            if (i % 2 == 1) {
                System.out.print("* "); 
            } else {
                System.out.print(i + " "); 
            }
        }
    }
}
