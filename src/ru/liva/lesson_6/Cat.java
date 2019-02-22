package ru.liva.lesson_6;

/**
 * @author liva
 */
public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public boolean run(float lengthRun) {
		setLengthRun(lengthRun);
		super.run(lengthRun);
		return (lengthRun <= 200);
	}

	@Override
	public boolean jump(float hightJump) {
		setHightJump(hightJump);
		super.jump(hightJump);
		return (hightJump <= 2);
	}

	@Override
	public boolean swim(float lengthSwim) {
		setLengthSwim(lengthSwim);
		super.swim(lengthSwim);
		return false;
	}

	@Override
	public void printInfo() {
		super.printInfo();
	}
}
