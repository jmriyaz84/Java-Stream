package com;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String args[]) {
		List<String> countries = Arrays.asList("USA", "", "UK", "INDIA", "UAE", "", "ITALY");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> marks = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);

		System.out.println(countries);
		long count = countries.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty Strings: " + count);

		List<String> filtered = countries.stream().filter(coutry -> !coutry.isEmpty() && coutry.length() == 3)
				.collect(Collectors.toList());
		System.out.println("Filtered Countries: " + filtered);

		String mergedString = countries.stream().filter(coutry -> !coutry.isEmpty()).collect(Collectors.joining(","));
		System.out.println("Merged String: " + mergedString);

		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println("Squares List: " + squaresList);

		System.out.println("List: " + marks);
		IntSummaryStatistics stats = marks.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest Mark : " + stats.getMax());
		System.out.println("Lowest Mark : " + stats.getMin());
		System.out.println("Sum of all marks : " + stats.getSum());
		System.out.println("Average mark : " + stats.getAverage());
	}

}
