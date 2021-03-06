package lambda;

import org.apache.poi.ss.formula.functions.T;

public class MethodReferenceExample1 {

    public static void main(String[] args) {
//        Thread t = new Thread(() -> printMessage());
        Thread t = new Thread(MethodReferenceExample1::printMessage); // 這個等同於上面的Lambda
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
