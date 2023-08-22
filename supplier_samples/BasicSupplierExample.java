package supplier_samples;

import java.util.function.Supplier;

public class BasicSupplierExample {
    public static void main(String[] args) {
        
        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100) + 1;

      
        int random = randomNumberSupplier.get();
        System.out.println("Random Number: " + random);
    }
}
