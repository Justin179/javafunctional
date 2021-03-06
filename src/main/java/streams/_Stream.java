package streams;



import java.util.List;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("John", MALE),
                new Person("John", MALE)
        );

        people.stream()
                .map(p->p.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println(people.stream().allMatch(p -> p.gender.equals(FEMALE)));
        System.out.println(people.stream().anyMatch(p -> p.gender.equals(FEMALE)));
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,FEMALE
    }
}
