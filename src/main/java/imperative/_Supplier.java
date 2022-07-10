package imperative;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(supplier.get());
        System.out.println(supplier2.get());
    }

    static Supplier<String> supplier = () -> "abc";
    static Supplier<List<String>> supplier2 = () -> List.of("abc","def");
}
