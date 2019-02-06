package Lessons;

import java.util.Arrays;
import java.util.Random;

/**
 * @author liva
 */
public class Program {
	private static void replace0With1() {
		int[] arr = {1, 0, 1, 1, 0, 0, 1, 0};

		System.out.println("Исходный массив " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				arr[i] = 1;
			else
				arr[i] = 0;
		}
		System.out.println("Обратный массив " + Arrays.toString(arr));
	}

	private static void fillElementsMultiplesOf3() {
		int[] arr = new int[8];

		for (int i = 0; i < arr.length; i++)
			arr[i] = i * 3;

		System.out.println(Arrays.toString(arr));
	}

	private static void numLessThan6Times2() {
		int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6)
				arr[i] *= 2;
		}

		System.out.println(Arrays.toString(arr));
	}

	private static void fillDiagonalWith1() {
		int[][] arr = new int[5][5];

		System.out.println("Исходный массив " + Arrays.deepToString(arr));

		for (int i = 0; i < arr.length; i++)
			{
				arr[i][i] = 1;
				arr[i][(arr.length - 1) - i] = 1;
			}

		System.out.println("Новый массив с диагональю 1 " + Arrays.deepToString(arr));
	}

	private static int[] makeArrays(int n) {
		int[] arrays = new int[n];

		for (int i = 0; i < n; i++) {
			arrays[i] = new Random().nextInt(20);
		}

		return arrays;
	}

	private static void findArrMinMax(int[] arrays) {
		System.out.println("Исходный массив " + Arrays.toString(arrays));

		int min = arrays[0];
		int max = arrays[0];

		for (int element : arrays) {
			if (element < arrays[0])
				min = element;
			if (element > arrays[0])
				max = element;
		}

		System.out.println("Минимум массива " + min);
		System.out.println("Максимум массива " + max);
	}

	private static boolean checkBalance(int[] arrays) {
		int sum = 0;
		int sumArr = 0;

		for (int element : arrays) {
			sum += element;
		}

		int halfSum = sum / 2;

		while (sumArr < halfSum)
			for (int element : arrays) {
			sumArr += element;
			if (sumArr == halfSum) {
				break;
			}
		}

		return sumArr == halfSum;
	}

	private static void moveArray(int[] arrays, int n) {
		int[] additionalArray = new int[arrays.length];

		if (n >= 0) {
			for (int i = 0; i < arrays.length - n; i++)
				additionalArray[i + n] = arrays[i];
		}
		else
		{
			for (int i = 0; i < arrays.length - Math.abs(n); i++)
				additionalArray[i] = arrays[i + Math.abs(n)];
		}

		System.out.println(Arrays.toString(additionalArray));
	}

	public static void main(String[] args) {
		replace0With1();
		fillElementsMultiplesOf3();
		numLessThan6Times2();
		fillDiagonalWith1();
		findArrMinMax(makeArrays(5));
		int[] array = {1, 2, 2, 0, 5};
		System.out.println(checkBalance(array));
		moveArray(array, -3);
	}
}
