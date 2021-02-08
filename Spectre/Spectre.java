package Spectre;

import java.util.ArrayList;
import java.util.Scanner;

public class Spectre {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(234);
        numbers.add(32344);

        System.out.println(numbers);
        System.out.println(numbers.get(1));

        ArrayList<Person> people = new ArrayList<>();

        Person farrukh = new Person("Farrukh", 20);
        Person john = new Person("John", 20);
        Person joshua = new Person("Joshua", 20);

        john.setHeight(234);
        john.setWeight(342);

        farrukh.setHeight(174);
        farrukh.setWeight(76);

        joshua.setHeight(210);
        joshua.setWeight(310);

        people.add(farrukh);
        people.add(john);
        people.add(joshua);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please, enter a name and age seperated by comma, empty will stop");
            String details = scanner.nextLine();

            if (details.isEmpty()) {
                scanner.close();
                break;
            }

            details = details.replaceAll("\\s", "");
            String parts[] = details.split(",");

            String name = parts[0];
            int age = Integer.valueOf(parts[1]);

            people.add(new Person(name, age));
        }

        // for each loop
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
