package Lessons;

import java.util.Random;
import java.util.Scanner;

/**
 * @author liva
 */

public class Program {

	private static final String[] PRODUCTS = {
		"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
		"cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
		"pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
	};

	private static void guessNumberOfComputer(Scanner scanner) {
		int attempt = 3;
		int max = 9;
		Random random = new Random();
		int numberOfComputer = random.nextInt(max + 1);

		System.out.println(String.format("Компьютер загадал число от 0 по %d, отгадайте его с %d попыток", max, attempt));

		while (attempt >= 1) {
			System.out.println("Введите число от 0 до " + max);

			int numberOfUser = -1;
			if (scanner.hasNext()) {
				numberOfUser = scanner.nextInt();
			}

			if (numberOfUser > numberOfComputer) {
				System.out.println(String.format("Загаданное компьютером число меньше %d", numberOfUser));
				attempt--;
				continue;
			}

			if (numberOfUser < numberOfComputer) {
				System.out.println(String.format("Загаданное компьютером число больше %d", numberOfUser));
				attempt--;
			}
			else {
				break;
			}
		}

		if (attempt < 1) {
			System.out.println("Вы не угaдали!");
			continueGuessNumberOfComputer(scanner);
		}
		else {
			System.out.println("Вы угадали!");
			continueGuessNumberOfComputer(scanner);
		}
	}

	private static void continueGuessNumberOfComputer(Scanner scanner) {
		System.out.println("Сыграть еще раз? 1 - да, 0 - нет");

		int answer = scanner.nextInt();
		if (answer == 1) {
			guessNumberOfComputer(scanner);
		}
	}

	private static void guessWordOfComputer(Scanner scanner) {
		Random random = new Random();
		int indexOfWordOfComputer = random.nextInt(PRODUCTS.length);
		String userWord = "###############";
		char[] charUserWorld = userWord.toCharArray();
		System.out.println("Компьютер загадал продукт, отгадайте его!");

		for (int i = 0, j = i; i < PRODUCTS[indexOfWordOfComputer].length(); i++, j = i) {
			System.out.println(String.format("Введите %d букву.", (i + 1)));

			if (scanner.hasNext()) {
				char litter = scanner.next().trim().charAt(0);
				if (litter == PRODUCTS[indexOfWordOfComputer].charAt(i)) {
					System.out.println("Введена верная буква!");
					charUserWorld[i] = litter;
				}
				else {
					System.out.println("Введена неверная буква");
					charUserWorld[j] = PRODUCTS[indexOfWordOfComputer].charAt(i);
				}
				System.out.println(charUserWorld);
			}
			else {
				break;
			}
		}

		System.out.println(String.format("Игра окончена! Загаданное слово %s", PRODUCTS[indexOfWordOfComputer]));
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			guessNumberOfComputer(sc);
			guessWordOfComputer(sc);
		}
	}
}



