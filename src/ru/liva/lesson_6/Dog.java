package ru.liva.lesson_6;

/**
 * @author liva
 */
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public boolean run(float lengthRun) {
		setLengthRun(lengthRun);
		super.run(lengthRun);
		return (lengthRun <= 500);
	}

	@Override
	public boolean swim(float lengthSwim) {
		setLengthSwim(lengthSwim);
		super.swim(lengthSwim);
		return (lengthSwim <= 10);
	}

	@Override
	public boolean jump(float hightJump) {
		setHightJump(hightJump);
		super.jump(hightJump);
		return (hightJump <= 0.5);
	}

	@Override
	public boolean run(float lengthRun, float maxLengthRun) {
		setMaxLengthRun(maxLengthRun);
		return super.run(lengthRun, maxLengthRun);
	}
}
