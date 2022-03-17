package lambda;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
//        Greeter greeter = new Greeter();
//        Greeting helloWorldGreeting = new HelloWorldGreeting();
//        greeter.greet(helloWorldGreeting); // pass in a class that implements the function/action

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("innerClassGreeting");
            }
        };
        innerClassGreeting.perform();


        Greeting myLambda = () -> System.out.println("MyMethod");
        myLambda.perform();


        Greeter greeter = new Greeter();
        greeter.greet(innerClassGreeting);
        greeter.greet(myLambda);
    }
}


