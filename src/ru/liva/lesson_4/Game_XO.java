package ru.liva.lesson_4;

import java.util.Random;
import java.util.Scanner;

/**
 * @author liva
 */

public class Game_XO {
	private static final int      SIZE      = 3;
	private static final char     DOT_EMPTY = ' ';
	private static final char     DOT_X     = 'X';
	private static final char     DOT_O     = 'O';
	private static       char[][] map;
	private static       Scanner  scanner   = new Scanner(System.in);
	private static       Random   random    = new Random();

	private static void initMap() {
		map = new char[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				map[i][j] = DOT_EMPTY;
			}
		}
	}

	private static void printMap() {
		for (int i = 0; i <= SIZE; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < SIZE; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < SIZE; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static boolean isCellValid(int x, int y) {
		if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
			return false;
		}
		return map[x][y] == DOT_EMPTY;
	}

	private static void humanTurn() {
		int x;
		int y;
		do {
			System.out.println("Введите координату x");
			x = scanner.nextInt() - 1;
			System.out.println("Введите координату y");
			y = scanner.nextInt() - 1;
		}
		while (!isCellValid(x, y));
		map[x][y] = DOT_X;
	}

	private static void computerTurn() {
		int x;
		int y;
		do {
			x = random.nextInt(SIZE);
			y = random.nextInt(SIZE);
		}
		while (!isCellValid(x, y));
		System.out.println(String.format("Компьютер походил x %d  y %d", (x + 1), (y + 1)));
		map[x][y] = DOT_O;
	}

	private static boolean checkWin(char symb) {
		if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) {
			return true;
		}
		if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) {
			return true;
		}
		if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) {
			return true;
		}
		if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) {
			return true;
		}
		if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) {
			return true;
		}
		if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) {
			return true;
		}
		if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) {
			return true;
		}
		if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) {
			return true;
		}
		return false;
	}


	private static boolean checkWin0(char DOT) {
		int countMax = 0;
		for (int i = 0; i < SIZE; i++) {
			int count0 = 0;
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			for (int j = 0; j < SIZE; j++) {
				if (map[i][j] == DOT) {
					count0++;
				}
				if (map[j][i] == DOT) {
					count1++;
				}
				if (map[j][j] == DOT) {
					count2++;
				}
				if (map[j][SIZE - 1 - j] == DOT) {
					count3++;
				}
			}
			countMax = Math.max(count0, Math.max(count1, Math.max(count2, count3)));
			if (countMax == 3) {
				break;
			}
		}
		return (countMax == 3);
	}

	private static boolean isMapFull() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (map[i][j] == DOT_EMPTY) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean checkEndGame(char DOT) {
		if (checkWin0(DOT)) {
			System.out.println(DOT == DOT_X ? "Человек победил" : "Компьютер победил");
			return true;
		}
		if (isMapFull()) {
			System.out.println("Ничья");
		}
		return false;
	}

	public static void main(String[] args) {
		initMap();
		printMap();
		while (true) {
			humanTurn();
			printMap();
			if (checkEndGame(DOT_X)) {
				break;
			}
			computerTurn();
			printMap();
			if (checkEndGame(DOT_O)) {
				break;
			}
		}
		System.out.println("Игра окончена");
	}
}
