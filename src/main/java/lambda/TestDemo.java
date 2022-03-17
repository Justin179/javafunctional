package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a,b) -> a-b;
        int res = comparator.compare(5,3);
        System.out.println(res);

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.forEach(a -> System.out.println(a));

        // Lambda就是在實作一個介面

        // 物件名稱::方法名稱
        int i = Math.subtractExact(5, 2);
        System.out.println(i);

        // Math::subtractExact; 參考物件內的靜態方法
        Comparator<Integer> comparator1 = Math::subtractExact;
        int compare = comparator1.compare(5, 1);
        System.out.println(compare);
    }
}
