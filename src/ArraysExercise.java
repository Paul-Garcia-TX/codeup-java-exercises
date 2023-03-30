import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[][] bands = {
                {"John", "Paul", "George", "Ringo"},
                {"Anthony", "Frusciante", "Flea", "Chad"}
        };
        System.out.println(Arrays.toString(bands[1]) + " Are in the band known as the Red Hot Chili Peppers");
        System.out.println(Arrays.toString(bands[0]) + " Are in the band known as the Beatles");

        Person[] people = new Person[]{
                new Person("John", 26),
                new Person("Chris", 33),
                new Person("Danny", 63)
        };
        Person newPerson = new Person("Carl", 30);

        Person[] newPeople = addPerson(people, newPerson);

        for (Person person : newPeople) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        }
    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        newPeople[newPeople.length - 1] = newPerson;
        return newPeople;
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
