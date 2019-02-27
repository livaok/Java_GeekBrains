package ru.liva.lesson_7;

/**
 * @author liva
 */
public class Cat {

	private final String  name;
	private       int     appetite;
	private       boolean satiety;

	public Cat(String name, int appetite, boolean satiety) {
		this.name = name;
		this.appetite = appetite;
		this.satiety = satiety;
	}

	public void eat(Plate plate) {
		satiety = plate.decrease(appetite);
	}

	public void infoSatiety() {
		System.out.println(String.format("Насыщенность кота %s - %s", name, satiety));
	}
}
