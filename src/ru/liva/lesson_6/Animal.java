package ru.liva.lesson_6;

/**
 * @author liva
 */
public abstract class Animal {
	private final String name;
	private       int    maxDistanceRun;
	private       int    maxDistanceSwim;
	private       int    maxDistanceJump;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getMaxDistanceRun() {
		return maxDistanceRun;
	}

	public void setMaxDistanceRun(int maxDistanceRun) {
		this.maxDistanceRun = maxDistanceRun;
	}

	public int getMaxDistanceSwim() {
		return maxDistanceSwim;
	}

	public void setMaxDistanceSwim(int maxDistanceSwim) {
		this.maxDistanceSwim = maxDistanceSwim;
	}

	public int getMaxDistanceJump() {
		return maxDistanceJump;
	}

	public void setMaxDistanceJump(int maxDistanceJump) {
		this.maxDistanceJump = maxDistanceJump;
	}

	public boolean run(int distance) {
		if (distance < 0) {
			throw new IllegalArgumentException();
		}
		return distance <= maxDistanceRun;
	}

	public boolean swim(int distance) {
		if (distance < 0) {
			throw new IllegalArgumentException();
		}
		return distance <= maxDistanceSwim;
	}

	public boolean jump(int distance) {
		if (distance < 0) {
			throw new IllegalArgumentException();
		}
		return distance <= maxDistanceJump;
	}
}
