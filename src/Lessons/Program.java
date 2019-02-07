package Lessons;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author liva
 */
public class Program {
	private static void replace0With1() {
		int[] arr = {1, 0, 1, 1, 0, 0, 1, 0};

		System.out.println(String.format("Исходный массив %s", Arrays.toString(arr)));

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] == 0 ? 1 : 0;
		}

		System.out.println(String.format("Обратный массив %s", Arrays.toString(arr)));
	}

	private static void fillElementsMultiplesOf3() {
		int[] arr = new int[8];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
		}

		System.out.println(Arrays.toString(arr));
	}

	private static void numLessThan6Times2() {
		int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6) {
				arr[i] *= 2;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	private static void fillDiagonalWith1() {
		int[][] arr = new int[5][5];

		System.out.println(String.format("Исходный массив %s", Arrays.deepToString(arr)));

		for (int i = 0; i < arr.length; i++) {
			arr[i][i] = 1;
			arr[i][(arr.length - 1) - i] = 1;
		}

		System.out.println(String.format("Новый массив с диагональю 1: \n%s", Arrays.deepToString(arr)));
	}

	private static int[] makeArrays(int n) {
		int[] arrays = new int[n];
		Random random = new Random();

		for (int i = 0; i < n; i++) {
			arrays[i] = random.nextInt(20);
		}

		return arrays;
	}

	private static void findArrMinMax(int[] arrays) {
		System.out.println(String.format("Исходный массив %s", Arrays.toString(arrays)));

		int min = arrays[0];
		int max = arrays[0];

		for (int array : arrays) {
			if (array < min) {
				min = array;
			}
			if (array > max) {
				max = array;
			}
		}

		System.out.println(String.format("Минимум массива %d", min));
		System.out.println(String.format("Максимум массива %d", max));
	}

	private static void checkBalance(int[] arrays) {
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

			System.out.println(sumArr == halfSum);
		}
	}

	private static void checkBalanceVarTwo(int[] arrays) {
		int sumLeft = 0;
		int sumRight = 0;

		for (int i = 0, j = arrays.length - 1; i <= j; ) {
			if (sumLeft == 0) {
				sumLeft += arrays[i++];
				continue;
			}
			if (sumRight == 0) {
				sumRight += arrays[j--];
				continue;
			}
			if (sumLeft > sumRight) {
				sumRight += arrays[j--];
				continue;
			}
			if (sumLeft < sumRight) {
				sumLeft += arrays[i++];
			}
			if (sumLeft == sumRight) {
				break;
			}
		}
		System.out.println(sumLeft == sumRight);
	}

	private static void moveArray(int[] arrays, int n) {
		int[] additionalArray = new int[arrays.length];

		if (n >= 0) {
			for (int i = 0; i < arrays.length - n; i++) {
				additionalArray[i + n] = arrays[i];
			}
		} else {
			for (int i = 0; i < arrays.length - Math.abs(n); i++) {
				additionalArray[i] = arrays[i + Math.abs(n)];
			}
		}

		System.out.println(Arrays.toString(additionalArray));
	}

	//дополнительные задания

	private static double checkEuclideanDistance(int[] x, int[] y) {
		int pow = 0;
		double sum = 0;

		if ((x.length >= y.length)) {
			int[] c = new int[x.length];
			System.arraycopy(y, 0, c, 0, (c.length - 1));

			for (int i = 0; i < c.length; i++) {
				pow += Math.pow(x[i] - c[i], 2);
			}
			sum = Math.sqrt(pow);
		} else {
			int[] c = new int[y.length];
			System.arraycopy(x, 0, c, 0, (c.length - 1));
			for (int i = 0; i < c.length; i++) {
				pow += Math.pow(y[i] - c[i], 2);
			}
			sum = Math.sqrt(pow);
		}

		return sum;
	}

	private static void replaceElementsArrays(String[] arrays) {
		String[] newArrays = new String[arrays.length];

		for (int i = 0; i < arrays.length; i++) {
			newArrays[i] = arrays[arrays.length - 1 - i];
		}
		System.out.println(Arrays.toString(newArrays));
	}

	//private static void a()
	//{
	//	int[] a                                 не определена длина массива
	//	for (int i = 0; i < 10; i++) {
	//		a[i] = i*i;
	//	}
	//}

	private static void contentArrays(char[][] arrays) {
		String contentArrays = "";
		String valueFalse = "false";
		String valueTrue = "true";
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				if (arrays[i][j] == '*') {
					contentArrays = contentArrays + "Содержимое элемента [" + i + "]" + "[" + j + "] " + valueTrue + "\n";
				}
				if (arrays[i][j] == ' ') {
					contentArrays = contentArrays + "Содержимое элемента [" + i + "]" + "[" + j + "] " + valueFalse + "\n";
				}
			}
		}
		System.out.println(contentArrays);
	}

	private static void checkMethodFibonachchi() {
		int n = 10;
		boolean result = false;
		int[] a = new int[n];
		a[0] = 1;
		a[1] = 1;

		for (int i = 2; i < n; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}

		System.out.println(Arrays.toString(a));
		System.out.println(String.format("Данный массив запишет %d чисел Фибоначчи", n));
	}

	private static void checkMethodLogic() {
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};

		System.out.println(String.format("Сравнение ссылок на массивы, ссылки на которые не равны, дает %s", a == b));
	}

	private static void deal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число раздач карт ");
		int n = scanner.nextInt();
		Random random = new Random();
		final String[] CARDS = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
		String[][] deck = new String[n][5];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				deck[i][j] = CARDS[random.nextInt(CARDS.length - 1)];
			}
		}

		System.out.println(String.format("Ваша раздача: %s", Arrays.deepToString(deck)));
	}

	public static void main(String[] args) {
		replace0With1();
		fillElementsMultiplesOf3();
		numLessThan6Times2();
		fillDiagonalWith1();
		findArrMinMax(makeArrays(5));
		checkBalance(new int[]{2, 3, 5});
		checkBalanceVarTwo(new int[]{1, 1, 1, 1, 4});
		moveArray(new int[]{6, 8, 3, 8, 9, 5, 3}, -3);
		int[] a = {2, 5, 7, 4};
		int[] b = {3, 7, 8, 5, 8};
		System.out.println(checkEuclideanDistance(a, b));
		String[] arrayOfChar = {"a", "b", "c"};
		replaceElementsArrays(arrayOfChar);
		char[][] arrayOfSymbols = {{' ', '*', '*'}, {'*', ' ', ' '}, {'*', '*', '*'}};
		contentArrays(arrayOfSymbols);
		checkMethodFibonachchi();
		checkMethodLogic();
		deal();
	}
}
