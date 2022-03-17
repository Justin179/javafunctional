package lambda;

public class Lambdas {
    public static void main(String[] args) {

        /*
        在Java7時，任何的邏輯，都必須跟某個類別挷在一起，邏輯無法單獨存在
        但Java8之後，邏輯可以單獨存在，不用一定要包在某一個類別裡面。
         */

        Cat cat = new Cat();
//        cat.print();
//        printThing(cat);
        // 到這裡，是非Lambda的寫法

        // 以下透過Lambda就不用類別了，可以直接寫方法，用Interface接起來，再當參數傳進去即可使用

//        printThing(()-> System.out.println("Meow"));



        Printable printable = (a,b) -> System.out.println(a+b);
        printThing(printable);
    }


    static void printThing(Printable thing){
        thing.print("Meow","Meow");
    }
}
