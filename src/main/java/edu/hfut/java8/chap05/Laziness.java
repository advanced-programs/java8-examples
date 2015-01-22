package edu.hfut.java8.chap05;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class Laziness {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> twoEvenSquares = numbers.stream().filter(n -> {
			System.out.println("filtering " + n);
			return n % 2 == 0;
		}).map(n -> {
			System.out.println("mapping " + n);
			return n * n;
		}).limit(2).collect(toList());

	}

}
