package lambda;

public class ThisReferenceExample {

    public void execute(){
        doProcess(10, i -> {
            System.out.println("value of i is " + i);
            System.out.println(this); // this refers to thisReferenceExample
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
//        thisReferenceExample.doProcess(10, i -> {
//            System.out.println("value of i is " + i);
////            System.out.println(this);
//        });

        thisReferenceExample.execute();
    }

    public void doProcess(int i, Process p){
        p.process(i);
    }

    @Override
    public String toString() {
        return "ThisReferenceExample{}";
    }
}
