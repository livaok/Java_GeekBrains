package ru.liva.lesson_7;

/**
 * @author liva
 */
public class Plate {
	private int food;

	public Plate(int food) {
		this.food = food;
	}

	public void infoPlate() {
		System.out.println(String.format("В миске осталось %d еды", food));
	}

	public boolean decrease(int appetite) {
		if (food >= appetite) {
			food -= appetite;
			return true;
		}
		else {
			return false;
		}
	}

	public void addFood(int food) {
		this.food += food;
	}
}
