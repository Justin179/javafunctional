package lambda;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
//        Thread t = new Thread(() -> printMessage());
        Thread t = new Thread(MethodReferenceExample2::printMessage); // 這個等同於上面的Lambda
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
