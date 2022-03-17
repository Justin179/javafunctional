package lambda;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda stringLengthLambda = s -> s.length();
        // System.out.println(stringLengthLambda.getLength("hello lambda"));
        printLambda(stringLengthLambda);
    }

    private static void printLambda(StringLengthLambda stringLengthLambda) {
        System.out.println(stringLengthLambda.getLength("hello lambda"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }
}
