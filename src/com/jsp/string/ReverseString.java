package com.jsp.string;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "hello";
		String rev = "";
		for (int i = 0; i < s1.length(); i++) {

		}
		System.out.println(s1);
		for (int i = 0; i < s1.length(); i++) {

			rev = s1.charAt(i) + rev;

		}
		System.out.println(rev);

	}
}
