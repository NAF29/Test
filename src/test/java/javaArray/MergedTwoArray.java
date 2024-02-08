package javaArray;

import java.util.Arrays;

public class MergedTwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 10, 21, 32, 44, 50, 36 };
		int[] arr2 = { 11, 22, 32, 42, 51, 16 };

		int[] mergedArray = new int[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
		System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

		System.out.println(Arrays.toString(mergedArray));

	}

}
