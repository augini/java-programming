package Spectre;

import java.util.ArrayList;

public class Spectre {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(234);
        numbers.add(32344);

        System.out.println(numbers);
        System.out.println(numbers.get(1));

        ArrayList<Person> people = new ArrayList<>();

        Person farrukh = new Person("Farrukh");
        Person john = new Person("John");

        john.setHeight(234);
        john.setWeight(342);

        farrukh.setHeight(174);
        farrukh.setWeight(76);

        people.add(farrukh);
        people.add(john);

        System.out.println("printing people list");
        System.out.println(people.get(0));
    }
}
