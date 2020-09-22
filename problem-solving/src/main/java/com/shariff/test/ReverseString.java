package com.shariff.test;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		char[] inputArray = { 'h', 'e', 'l', 'l', 'o' };
		reverseString(inputArray);
	}

	public static void reverseString(char[] s) {
		char[] temp = Arrays.copyOf(s, s.length);
		for (int i = temp.length - 1; i >= 0; i--) {
			s[temp.length - i - 1] = temp[i];
		}
		System.out.println(s);
	}

}
