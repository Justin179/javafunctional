package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Lewis", "Carroll", 43),
                new Person("Lewis", "Barroll", 42),
                new Person("Lewis", "Aarroll", 41),
                new Person("Lewis", "Darroll", 44)
        );

        /*
        new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        }
         */
        // sort list by last name
        Collections.sort(personList, (o1,o2) -> o1.getLastName().compareTo(o2.getLastName()));


        // prints all elements in the list
//        printAll(personList);
        performConditionally(personList, p -> true, p -> System.out.println(p));

        /*
        new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        }
         */
        // prints all people that have last name beginning with C
        performConditionally(personList, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getFirstName()));
    }

    private static void performConditionally(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p: personList){
            if(predicate.test(p)) // if(p.getLastName().startsWith("C")){
                consumer.accept(p);

        }
    }

//    private static void printAll(List<Person> personList) {
//        for(Person p : personList){
//            System.out.println(p.toString());
//        }
//    }
}
