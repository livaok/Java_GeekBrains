package ru.liva.lesson_6;

/**
 * @author liva
 */
public class Main {
	public static void main(String[] args) {
		Animal cat = new Cat("котик Пыщка");
		Animal dog1 = new Dog("пес Рекс");
		Animal dog2 = new Dog("пес Барбос");
		cat.run(10);
		cat.swim(10);
		cat.jump(200);
		cat.printInfo();
		dog1.run(20);
		dog1.swim(50);
		dog1.jump(200);
		dog1.run(400, 600);
		dog1.printInfo();
		dog2.swim(40);
		dog2.jump(2);
		dog2.run(550, 400);
		dog2.printInfo();
	}
}
