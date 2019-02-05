package Lessons;

import java.util.Arrays;
import java.util.Random;

/**
 * @author liva
 */
public class Program {
	private static void arr01() {
		int[] arr = {
				1,
				0,
				1,
				1,
				0,
				0,
				1,
				0
		};
		System.out.println("Исходный массив " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			} else {
				arr[i] = 0;
			}
		}
		System.out.println("Обратный массив " + Arrays.toString(arr));
	}

	private static void arr3() {
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void arr6() {
		int[] arr = new int[]{1, 5,
				3,
				2,
				11,
				4,
				5,
				2,
				4,
				8,
				9,
				1
		};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6) {
				arr[i] *= 6;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void arrDiagonal1() {
		int[][] arr = new int[5][5];

		System.out.println("Исходный массив " + Arrays.deepToString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = 1;
					arr[i][(arr.length - 1) - i] = 1;
				}
			}
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
			if (element < arrays[0]) {
				min = element;
			}
			if (element > arrays[0]) {
				max = element;
			}
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
		while (sumArr < halfSum) {
			for (int element : arrays) {
				sumArr += element;
				if (sumArr == halfSum) {
					break;
				}
			}
		}

		return sumArr == halfSum;
	}

	private static void simpleMoveArray(int[] arrays, int n) {
		int[] help = new int[arrays.length];
		if (n >= 0) {
			for (int i = 0; i < arrays.length - n; i++) {
				help[i + n] = arrays[i];
			}
		} else {
			for (int i = 0; i < arrays.length - Math.abs(n); i++) {
				help[i] = arrays[i + Math.abs(n)];
			}
		}
		System.out.println(Arrays.toString(help));
	}

	private static void hardMoveArray(int[] arrays, int n) {
		int help;

		if (n >= 0) {
			for (int i = 0; i < arrays.length - n; i++) {
				{
					if (i < n) {
						arrays[i + n] = arrays[i];
						arrays[i] = 0;
					} else {
						arrays[i + n] = arrays[i];
					}
				}
			}
		} else {
			for (int i = 0; i < arrays.length - Math.abs(n); i++) {
				arrays[i] = arrays[i + Math.abs(n)];
			}
		}
		System.out.println(Arrays.toString(arrays));
	}

	public static void main(String[] args) {
		//arr01();
		//arr3();
		//arr6();
		//arrDiagonal1();
		//findArrMinMax(makeArray(5));
		int[] arr = {1, 2, 3, 4, 5, 6};
		//System.out.println(checkBalance(arr));
		simpleMoveArray(arr, 3);
		//hardMoveArray(arr, 2);
	}
}
