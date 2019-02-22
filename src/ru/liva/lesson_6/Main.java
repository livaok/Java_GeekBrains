package ru.liva.lesson_6;

/**
 * @author liva
 */
public class Main {
	public static void main(String[] args) {
		Animal cat = new Cat("котик Пыщка");
		Animal dog = new Dog("пес Рекс");
		cat.run(10);
		cat.swim(10);
		cat.jump(200);
		cat.printInfo();
		dog.run(20);
		dog.swim(50);
		dog.jump(200);
		dog.printInfo();
	}
}
