package edu.hfut.java8.chap09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Intro {

	public static void main(String... args) {
		List<Integer> numbers = Arrays.asList(3, 5, 1, 2, 6);
		// sort是默认的方法
		// naturalOrder是静态方法
		numbers.sort(Comparator.naturalOrder());
		System.out.println(numbers);
	}

}
