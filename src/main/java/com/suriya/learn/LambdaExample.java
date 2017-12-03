package com.suriya.learn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class LambdaExample {
	public static void main(String[] args) {
		// bounded for loop
		List<Integer> values = Arrays.asList(1, 2, 3, 4);
		System.out.println("Old java:");
		for (int i = 0; i < 4; i++) {
			System.out.println(values.get(i));
		}
		// foreach loop java 5
		System.out.println("Java 5:");
		for (int value : values) {
			System.out.println(value);
		}
		// for loop java 8
		System.out.println("Java 8 with consumer:");
		values.forEach(new Consumer<Integer>() {
			public void accept(Integer value) {
				System.out.println(value);
			}
		});
		// Java 8 lambda - removing ceremony(unwanted piece of code)
		System.out.println("Java 8 with lambda:");
		values.forEach((Integer value) -> System.out.println(value));
		// Java 8 removing the "type" of value within values
		System.out.println("Java 8 with lambda - type removed:");
		values.forEach((value) -> System.out.println(value));
		// Java 8 removing unwanted parentheses
		System.out.println("Java 8 with lambda - Parentheses removed:");
		values.forEach(value -> System.out.println(value));
		// Java 8 removing value - as there is no change in value and is directly passed
		// to the prinln function as an arg
		System.out.println("Java 8 with lambda - passing as a unachaged value arg to method:");
		values.forEach(System.out::println);

	}
}
