package com.yearup.workingwithinterfaces;

// comparable lets you define how to compare two objects of the same type
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // this is where you write the logic for sorting
    @Override
    public int compareTo(Person other) {
        // Compare by last name first
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        // If last names are the same, compare by first name
        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        // If first names are also the same, compare by age
        return Integer.compare(this.age, other.age);
    }
}
