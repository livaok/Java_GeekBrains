package ru.liva.lesson_7;

/**
 * @author liva
 */
public class Main {

	public static void main(String[] args) {
		Plate plate = new Plate(500);

		Cat murka = new Cat("Мурка", 300, false);
		Cat barsik = new Cat("Барсик", 100, false);
		Cat marusya = new Cat("Маруся", 350, false);
		Cat pysch = new Cat("Пыщ", 250, false);
		Cat conrad = new Cat("Конрад", 100, false);

		Cat[] cats = {murka, barsik, marusya, pysch, conrad};

		for (Cat cat : cats) {
			cat.eat(plate);
			plate.addFood(50);
			cat.infoSatiety();
			plate.infoPlate();
		}
	}
}