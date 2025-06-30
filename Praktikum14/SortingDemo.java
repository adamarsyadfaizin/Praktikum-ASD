import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>(); [cite: 33]
        daftarSiswa.add("Zainab"); [cite: 33]
        daftarSiswa.add("Andi"); [cite: 33]
        daftarSiswa.add("Rara"); [cite: 33]
        Collections.sort(daftarSiswa); [cite: 33]

        System.out.println("Sorted student list: " + daftarSiswa); [cite: 33]
        System.out.println();

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Zakia"));
        customers.add(new Customer(5, "Budi"));
        customers.add(new Customer(4, "Cica"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name)); [cite: 36]
        System.out.println("Sorted customers by name: " + customers); [cite: 36]
        System.out.println();

        TreeSet<Customer> sortedCustomersTreeSet = new TreeSet<>((c1, c2) -> c1.name.compareTo(c2.name));
        sortedCustomersTreeSet.add(new Customer(1, "Zakia"));
        sortedCustomersTreeSet.add(new Customer(5, "Budi"));
        sortedCustomersTreeSet.add(new Customer(4, "Cica"));
        System.out.println("Customers in TreeSet sorted by name: " + sortedCustomersTreeSet);
    }
}