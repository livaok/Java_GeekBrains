package Lessons;

import java.util.Random;
import java.util.Scanner;

/**
 * @author liva
 */

public class Program {

	private static void guessNumberOfComputer() {
		int attempt = 3;
		int max = 9;
		Random random = new Random();
		int numberOfComputer = random.nextInt(max + 1);
		Scanner scanner = new Scanner(System.in);
		System.out.println(String.format("Компьютер загадал число от 0 по %d, отгадайте его с %d попыток", max, attempt));
		while (attempt >= 1) {
			System.out.println("Введите число от 0 до " + max);
			int numberOfUser = scanner.nextInt();
			if (numberOfUser > numberOfComputer) {
				System.out.println(String.format("Загаданное компьютером число меньше %d", numberOfUser));
				attempt--;
				continue;
			}
			if (numberOfUser < numberOfComputer) {
				System.out.println(String.format("Загаданное компьютером число больше %d", numberOfUser));
				attempt--;
			} else {
				break;
			}
		}
		if (attempt < 1) {
			System.out.println("Вы не угaдали!");
			answerToContinueGame();
		} else {
			System.out.println("Вы угадали!");
			answerToContinueGame();
		}
		scanner.close();
	}

	private static void answerToContinueGame() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Сыграть еще раз? 1 - да, 0 - нет");
		int answer = scanner.nextInt();
		if (answer == 1) {
			guessNumberOfComputer();
		}
		scanner.close();
	}

	//private static String getWordOfComputer() {
	//	String[] words = {
	//			"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
	//			"cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
	//			"pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
	//	Random random = new Random();
	//	int indexOfWordOfComputer = random.nextInt(words.length);
	//	return words[indexOfWordOfComputer];
	//}

	private static void guessWordOfComputer() {
		String[] words = {
				"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
				"cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
				"pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
		Random random = new Random();
		int indexOfWordOfComputer = random.nextInt(words.length);
		String userWord = "###############";
		//Scanner scanner = new Scanner(System.in);
		//char litter = scanner.next().trim().charAt(0);
		char[] charUserWorld = userWord.toCharArray();

		for (int i = 0, j = 0; i < words[indexOfWordOfComputer].length(); i++, j++){
			System.out.println("Введите букву");
			Scanner scanner = new Scanner(System.in);
			char litter = scanner.next().trim().charAt(0);
			if(litter == words[indexOfWordOfComputer].trim().charAt(i)){
				charUserWorld[j] = litter;
				System.out.println(charUserWorld[j]);
			}
		}

		//for (int i = 0, j = 0; i < (words[indexOfWordOfComputer]).length(); i++, j++){
		//if (litter.equals(words[indexOfWordOfComputer].charAt(0))) {
		//	charUserWorld[0] = litter.charAt(0);
		//}
		System.out.println(charUserWorld);
	}

	public static void main(String[] args) {
		//guessNumberOfComputer();
		guessWordOfComputer();

	}
}



