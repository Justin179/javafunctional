package imperative;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        Function<Integer, Integer> add1AndTimes20 = add1.andThen(times20);
        Integer result = add1AndTimes20.apply(2);
        System.out.println(result);

        Integer apply = biFunction.apply(7, 8);
        System.out.println(apply);

    }

    static BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> (a+1)*b;

    static Function<Integer,Integer> add1 = n->n+1;
    static Function<Integer,Integer> times20 = n->n*20;



}
