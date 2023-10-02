package com.jsp.string;

public class SplitString {

	public static void main(String[] args) {
		String s1="HelloGoodMorning";
		String a[]=s1.split("");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
