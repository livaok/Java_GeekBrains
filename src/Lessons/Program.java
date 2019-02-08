package Lessons;

import java.util.Random;
import java.util.Scanner;

/**
 * @author liva
 */

public class Program {

	private static void guessNumberOfComputer() {
		int attempt = 1;
		int max = 9;
		Random random = new Random();
		int numberOfComputer = random.nextInt(max + 1);
		Scanner scanner = new Scanner(System.in);
		System.out.println(String.format("Компьютер загадал число от 0 по %d, отгадайте его с 3 попыток", max));
		while (attempt <= 3) {
			System.out.println("Введите число от 0 до " + max);
			int numberOfUser = scanner.nextInt();
			if (numberOfUser > numberOfComputer) {
				System.out.println(String.format("Загаданное компьютером число меньше %d", numberOfUser));
				attempt++;
				continue;
			}
			if (numberOfUser < numberOfComputer) {
				System.out.println(String.format("Загаданное компьютером число больше %d", numberOfUser));
				attempt++;
			} else {
				break;
			}
		}
		if (attempt > 3) {
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

	public static void main(String[] args) {
		guessNumberOfComputer();
	}
}



