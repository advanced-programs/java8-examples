package edu.hfut.java8.author;

import java.util.Arrays;

@Author(name = "wanggang")
@Author(name = "wgybzb")
@Author(name = "robot")
public class AuthorInfo {

	public static void main(String[] args) {
		Author[] authors = AuthorInfo.class.getAnnotationsByType(Author.class);
		Arrays.asList(authors).stream().forEach(a -> {
			System.out.println(a.name());
		});
	}

}
