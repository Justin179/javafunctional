package finalsection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Justin", null, n -> System.out.println("no lastname for " + n));
        hello2("Justin", null, () -> System.out.println("no lastname"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName!=null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName!=null){
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
