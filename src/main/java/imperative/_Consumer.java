package imperative;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer = new Customer("justin", "1234");
        consumer.accept(customer);
        biConsumer.accept(customer,false);

    }

    static Consumer<Customer> consumer = c ->
            System.out.println(c.customerName + " has number "+c.customerPhoneNumber);

    static BiConsumer<Customer,Boolean> biConsumer = (c,showPhoneNumber) ->
            System.out.println(c.customerName + " has number " + (showPhoneNumber? c.customerPhoneNumber : "*****"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
