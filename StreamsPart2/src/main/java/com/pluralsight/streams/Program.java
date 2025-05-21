package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        String searchName = scanner.nextLine().trim().toLowerCase();

        // Use stream to filter the list of people based on the search name
        List<Person> matches = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(searchName) || person.getLastName().equalsIgnoreCase(searchName))
                .collect(Collectors.toList());

        System.out.println("Search results:");
        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (Person person : matches) {
                System.out.println(person.getFullName() + " | Age: " + person.getAge());
            }
        }

        int totalAge = people.stream()
                .map(Person::getAge) // Map to ages
                .reduce(0, Integer::sum); // Sum the ages

        double averageAge = (double) totalAge / people.size(); // Calculate average age

        int oldest = people.stream()
                .map(Person::getAge) // Map to ages
                .reduce(0, Integer::max); // Find the maximum age

        int youngest = people.stream()
                .map(Person::getAge) // Map to ages
                .reduce(Integer.MAX_VALUE, Integer::min); // Find the minimum age

        System.out.println("\nAge statistics (with streams):");
        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}