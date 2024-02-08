package javaArray;

import java.util.Arrays;

public class DividedIntoTwohalf {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int midPoint = number.length / 2;

		int[] firstHalf = Arrays.copyOfRange(number, 0, midPoint);
		int[] secondHalf = Arrays.copyOfRange(number, midPoint, number.length);

		System.out.println(Arrays.toString(firstHalf));
		System.out.println(Arrays.toString(secondHalf));
	}

}
