import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>(2); [cite: 6]
        Customer customer1 = new Customer(1, "Zakia"); [cite: 6]
        Customer customer2 = new Customer(5, "Budi"); [cite: 6]

        customers.add(customer1); [cite: 6]
        customers.add(customer2); [cite: 6]

        System.out.println("Initial customers:");
        for (Customer cust : customers) { [cite: 7]
            System.out.println(cust.toString()); [cite: 7]
        }
        System.out.println();

        customers.add(new Customer(4, "Cica")); [cite: 8]
        System.out.println("Customers after adding 'Cica':");
        for (Customer cust : customers) { [cite: 8]
            System.out.println(cust.toString()); [cite: 8]
        }
        System.out.println();

        customers.add(2, new Customer(100, "Rosa")); [cite: 10]
        System.out.println("Customers after adding 'Rosa' at index 2:");
        for (Customer cust : customers) { [cite: 10]
            System.out.println(cust.toString()); [cite: 10]
        }
        System.out.println();

        System.out.println("Index of customer2: " + customers.indexOf(customer2)); [cite: 12]
        System.out.println();

        Customer customer = customers.get(1); [cite: 13]
        System.out.println("Customer at index 1: " + customer.name); [cite: 13]
        customer.name = "Budi Utomo"; [cite: 13]
        System.out.println("Customers after changing name of customer at index 1:");
        for (Customer cust : customers) { [cite: 13]
            System.out.println(cust.toString()); [cite: 13]
        }
        System.out.println();

        ArrayList<Customer> customersNoInitialSize = new ArrayList<>(); [cite: 14]
        customersNoInitialSize.add(new Customer(10, "NoSizeCustomer1"));
        System.out.println("Customers in ArrayList instantiated without initial size:");
        System.out.println(customersNoInitialSize);
        System.out.println();

        ArrayList<Customer> newCustomers = new ArrayList<>(); [cite: 15]
        newCustomers.add(new Customer(201, "Della")); [cite: 16]
        newCustomers.add(new Customer(202, "Victor")); [cite: 16]
        newCustomers.add(new Customer(203, "Sarah")); [cite: 16]

        customers.addAll(newCustomers); [cite: 16]
        System.out.println("Customers after adding newCustomers collection:");
        for (Customer cust : customers) { [cite: 16]
            System.out.println(cust.toString()); [cite: 16]
        }
        System.out.println();

        System.out.println("Customers directly printed (for debugging): " + customers); [cite: 17]
    }
}