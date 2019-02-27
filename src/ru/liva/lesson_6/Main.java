package ru.liva.lesson_6;

/**
 * @author liva
 */
public class Main {
	public static void main(String[] args) {
		Cat barsik = new Cat("Barsik");

		barsik.setMaxDistanceRun(100);
		barsik.setMaxDistanceJump(5);

		System.out.println("Животноe " + barsik.getName() + " добежало? " + (barsik.run(10) ? "Да" : "Нет"));
		System.out.println("Животноe " + barsik.getName() + " допрыгнуло? " + (barsik.jump(6) ? "Да" : "Нет"));

		Dog rex = new Dog("Rex");

		rex.setMaxDistanceRun(600);
		rex.setMaxDistanceSwim(50);
		rex.setMaxDistanceJump(2);

		System.out.println("Животное " + rex.getName() + " добежало? " + (rex.run(700) ? "Да" : "Нет"));
		System.out.println("Животное " + rex.getName() + " доплыло? " + (rex.run(10) ? "Да" : "Нет"));
		System.out.println("Животное " + rex.getName() + " допрыгнуло? " + (rex.run(1) ? "Да" : "Нет"));
	}
}