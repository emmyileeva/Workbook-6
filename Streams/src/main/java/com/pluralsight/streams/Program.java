package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add some sample data
        people.add(new Person("John", "Doe", 25));
        people.add(new Person("Mark", "Rivera", 30));
        people.add(new Person("John", "Nguyen", 28));
        people.add(new Person("Jessie", "Clark", 24));
        people.add(new Person("Ava", "Smith", 33));
        people.add(new Person("Liam", "Johnson", 29));
        people.add(new Person("Maya", "Lee", 21));
        people.add(new Person("Ethan", "Garcia", 26));
        people.add(new Person("Olivia", "Brown", 27));
        people.add(new Person("Noah", "Jones", 22));

        // Search for a person by first or last name
        System.out.println("Enter a first or last name to search for:");
        String searchName = scanner.nextLine().toLowerCase();

        List<Person> match = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().toLowerCase().equals(searchName) ||
                    person.getLastName().toLowerCase().equals(searchName)) {
                match.add(person);
            }
        }

        System.out.println("Search results:");
        if (match.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (Person person : match) {
                System.out.println(person.getFullName() + " – Age: " + person.getAge());
            }
        }
        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person person : people) {
            int age = person.getAge();
            totalAge += age;
            if (age > oldest) oldest = age;
            if (age < youngest) youngest = age;
        }

        double averageAge = (double) totalAge / people.size();

        System.out.println("Age statistics:");
        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}