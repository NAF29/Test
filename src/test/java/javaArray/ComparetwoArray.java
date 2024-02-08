package javaArray;

import java.util.Arrays;

public class ComparetwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 13, 4, 5, 6 };
		int[] arr2 = { 1, 2, 3, 4, 5, 26 };

		boolean result = Arrays.equals(arr1, arr2);
		if (result == true) {
			System.out.println("Array matched");
		} else {
			System.out.println("Array doesnot matched");
		}

	}

}
