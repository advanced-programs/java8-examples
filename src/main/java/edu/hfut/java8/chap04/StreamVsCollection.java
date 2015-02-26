package edu.hfut.java8.chap04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollection {

	public static void main(String... args) {
		List<String> names = Arrays.asList("Java8", "Lambdas", "In", "Action");
		Stream<String> s = names.stream();
		s.forEach(System.out::println);
		// 运行该语句会抛出IllegalStateException异常
		// 因为stream流只能被消费一次
		// s.forEach(System.out::println);
	}

}