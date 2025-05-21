package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should print "List is full. Cannot add more items."

        System.out.println(numbers.getItems().size()); // should print 3

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
//        dates.add(15); // this line should fail because the type is LocalDate and not Integer

        System.out.println("Date list size: " + dates.getItems().size()); // should print 2

    }
}