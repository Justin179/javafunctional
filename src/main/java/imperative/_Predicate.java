package imperative;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        boolean test = predicate.test("07123456789");
        boolean test2 = predicate.test("071234567888");
        System.out.println(test2);

        System.out.println(predicate.and(predicate2).test("07123456789"));
        System.out.println(predicate.or(predicate2).test("07123456788"));
    }

    static Predicate<String> predicate = p -> p.startsWith("07") && p.length()==11;

    static Predicate<String> predicate2 = p -> p.contains("9");


}
