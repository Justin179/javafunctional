package lambda;

public class RunnableExample {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("printed inside runnable");
//            }
//        });
        Thread thread = new Thread(()-> System.out.println("test"));
        thread.run();
    }
}
