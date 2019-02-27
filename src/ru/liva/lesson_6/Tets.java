package ru.liva.lesson_6;

/**
 * @author liva
 */
public class Tets {

	public static abstract class Animal {

		private final String name;
		private float maxDistance;

		public Animal(String name) {
			this.name = name;
		}

		public float getMaxDistance() {
			return maxDistance;
		}

		public void setMaxDistance(float maxDistance) {
			this.maxDistance = maxDistance;
		}

		public boolean run(float distance) {
			if (distance <= 0) {
				throw new IllegalArgumentException();
			}

			return maxDistance >= distance;
		}
	}

	public static class Cat2 extends Animal {

		public Cat2(String name) {
			super(name);
		}
	}

	public static void main(String[] args) {
		Animal barsik = new Cat2("Barsik");
		barsik.setMaxDistance(10);

		System.out.println("Барсик добежал? - " + (barsik.run(5) ? "Да" : "Нет"));

	}
}
