package optional_samples;

import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CustomerDatabaseExample {
    private static Map<Integer, Customer> database = new HashMap<>();

    public static void main(String[] args) {
        initializeDatabase();

        int customerId = 2;
        Optional<Customer> customer = findCustomerById(customerId);

        customer.ifPresentOrElse(
            c -> System.out.println("Customer found: " + c.getName()),
            () -> System.out.println("Customer with ID " + customerId + " not found.")
        );
    }

    static void initializeDatabase() {
        database.put(1, new Customer(1, "Alice"));
        database.put(2, new Customer(2, "Bob"));
    }

    static Optional<Customer> findCustomerById(int id) {
        return Optional.ofNullable(database.get(id));
    }
}
