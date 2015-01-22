package edu.hfut.java8.chap05;

import static edu.hfut.java8.chap04.Dish.menu;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import edu.hfut.java8.chap04.Dish;

public class Filtering {

	public static void main(String... args) {

		// Filtering with predicate
		List<Dish> vegetarianMenu = menu.stream().filter(Dish::isVegetarian).collect(toList());

		vegetarianMenu.forEach(System.out::println);

		// Filtering unique elements
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

		// Truncating a stream
		List<Dish> dishesLimit3 = menu.stream().filter(d -> d.getCalories() > 300).limit(3).collect(toList());

		dishesLimit3.forEach(System.out::println);

		// Skipping elements
		List<Dish> dishesSkip2 = menu.stream().filter(d -> d.getCalories() > 300).skip(2).collect(toList());

		dishesSkip2.forEach(System.out::println);
	}

}
