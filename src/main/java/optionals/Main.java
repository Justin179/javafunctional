package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object o = Optional.ofNullable("ooo").orElseGet(() -> "xxx");
        System.out.println(o);

        Optional.ofNullable("abc@mail.com").ifPresent(m-> System.out.println(m));

        Optional.ofNullable(null).ifPresentOrElse(m-> System.out.println(m),()-> System.out.println("nothing"));



    }
}
