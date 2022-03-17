package lambda;

import java.util.*;


public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Lewis", "Carroll", 43),
                new Person("Lewis", "Barroll", 42),
                new Person("Lewis", "Aarroll", 41),
                new Person("Lewis", "Darroll", 44)
        );

        // sort list by last name
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        // prints all elements in the list
        printAll(personList);

        // prints all people that have last name beginning with C
        printLastNameBeginningWzC(personList, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });
    }

    private static void printLastNameBeginningWzC(List<Person> personList, Condition condition) {
        for (Person p: personList){
            if(condition.test(p)) // if(p.getLastName().startsWith("C")){
                System.out.println(p);

        }
    }

    private static void printAll(List<Person> personList) {
        for(Person p : personList){
            System.out.println(p.toString());
        }
    }
}

