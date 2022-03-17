package lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4};
        int key = 0;

//        process(someNumbers, key, (a,b) -> {
//            try {
//                System.out.println(a/b);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        });

        process(someNumbers, key, wrapperLambda((a,b) -> System.out.println(a/b)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> biConsumer) {
        for (int i : someNumbers){
            biConsumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> biConsumer){

        return (a,b) -> {
            try {
                biConsumer.accept(a,b);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }
}
