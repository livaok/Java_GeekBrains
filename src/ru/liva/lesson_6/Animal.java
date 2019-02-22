package ru.liva.lesson_6;

/**
 * @author liva
 */
public class Animal {
	private String name;
	private float  lengthRun;
	private float  lengthSwim;
	private float  hightJump;

	public Animal(String name) {
		this.name = name;
	}

	public float getLengthRun() {
		return lengthRun;
	}

	public void setLengthRun(float lengthRun) {
		if (lengthRun < 0) {
			this.lengthRun = 0;
		}
		else {
			this.lengthRun = lengthRun;
		}
	}

	public float getLengthSwim() {
		return lengthSwim;
	}

	public void setLengthSwim(float lengthSwim) {
		if (lengthSwim < 0) {
			this.lengthSwim = 0;
		}
		else {
			this.lengthSwim = lengthSwim;
		}
	}

	public float getHightJump() {
		return hightJump;
	}

	public void setHightJump(float hightJump) {
		if (hightJump < 0) {
			this.hightJump = 0;
		}
		else {
			this.hightJump = hightJump;
		}
	}

	public boolean run(float lengthRun) {
		this.lengthRun = getLengthRun();
		return false;
	}

	public boolean swim(float lengthSwim) {
		this.lengthSwim = getLengthSwim();
		return false;
	}

	public boolean jump(float hightJump) {
		this.hightJump = getHightJump();
		return false;
	}

	public void printInfo() {
		System.out.println("Возможность животным " + name + " пробежать " + getLengthRun() + " метров - " + run(getLengthRun()));
		System.out.println("Возможность животным " + name + " проплыть " + getLengthSwim() + " метров - " + swim(getLengthSwim()));
		System.out.println("Возможность животным " + name + " прыгнуть на " + getHightJump() + " метров - " + jump(getHightJump()));
	}
}
