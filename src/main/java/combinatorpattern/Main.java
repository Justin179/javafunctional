package combinatorpattern;

import java.time.LocalDate;
import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Alice", "alice@mail.com",
                "8899", LocalDate.of(2000, 1, 1));

        boolean valid = new CustomerValidatorService().isValid(customer);
        System.out.println(valid);


        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

    }
}
