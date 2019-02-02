package Lessons;

/**
 * @author liva
 */
public class Program
{
	//целочисленные типы
	byte aByte = 1;
	short aShort = 10;
	int anInt = 398;
	long aLong = 3996677;

	//с плавающей точкой
	float aFloat = 1.9F;
	double aDouble = 12.554;

	//символьный
	char aChar = 'c';

	//логический
	boolean aTrue = true;
	boolean aFakse = false;

	//строковый
	String word = "Word";

	private static double calculate(double a, double b, double c, double d)
	{
		return a * (b + (c / d));
	}

	private static boolean check(int x, int y)
	{
		return (x + y >= 10 && x + y <= 20);
	}

	private static boolean positive(int a)
	{
		return a >= 0;
	}

	private static boolean negative(int a)
	{
		return !positive(a);
	}

	private static void hello(String name)
	{
		System.out.println("Привет, " + name);
	}

	private static void year(int y)
	{
		if (y % 4 == 0 && !(y % 100 == 0) || y % 400 == 0)
			System.out.println(y + " - високосный год");
		else
			System.out.println(y + " - не високосный год");
	}

	private static void isTrue(boolean a, boolean b)
	{
		if ((!(a && b) && a || b) || (a && b || !(a || b)))
			System.out.println("Выражение всегда true");
	}

	private static void methodAB(int a, int b)
	{
		System.out.println(a == b);
	}

	private static boolean deleteAB(int a, int b)
	{
		return a % b == 0;
	}

	private static void partiesOfTriangle(int x, int y, int z)
	{
		if (x + y <= z || x + z <= y || y + z <= x)
			System.out.println(String.format("x = %d, y = %d и z = %d не могут быть сторонами треугольника", x, y, z));
		else
			System.out.println(String.format("x = %d, y = %d и z = %d могут быть сторонами треугольника", x, y, z));
	}

	private static void getRandomAB(int a, int b)
	{
		int i = (int) (Math.random() * (b - a + 1) + a);
		System.out.println(String.format("Случайное число в диапазон от %d до %d равно %d", a, b, i));
	}

	private static void diceRoll()
	{
		int i1 = (int) (Math.random() * 6 + 1);
		int i2 = (int) (Math.random() * 6 + 1);
		System.out.println(String.format("Сумма костей игровых кубиков равна %d", i1 + i2));
	}

	private static void checkSin(double t)
	{
		double sin1 = Math.sin(Math.toRadians(t * 2));
		double sin2 = Math.sin(Math.toRadians(t * 3));
		System.out.println(String.format("Сумма синусов углов %s и %s равна %s", t * 2, t * 3, sin1 + sin2));
	}

	private static void checkThreeNumbers(int a, int b, int c)
	{
		if (a == b && b == c)
			System.out.println("Введенные числа равны");
		else
			System.out.println("Введенные числа не равны");
	}

	private static void checkDayMonth(int d, int m)
	{
		if ((m > 3 && m < 6 && d > 0 && d <= 31) || (m == 3 && d >= 20 && d <= 31) || (m == 6 && d <= 20 && d > 0))
			System.out.println(String.format("Дата %d.0%d в периоде с 20.03 по 20.06",d, m));
		if ((m < 3 && d < 20 && d > 0) || (m > 6 && m < 10 && d > 20 && d <= 31))
			System.out.println(String.format("Дата %d.0%d не в периоде с 20.03 по 20.06",d, m));
		if ((m >= 10 && m <= 12) || (d > 20 && d <= 31))
			System.out.println(String.format("Дата %d.%d не в периоде с 20.03 по 20.06", d, m));
	}

	private static void check01(double a, double b)
	{
		if ((a >= 0 && b <= 1) || (b >= 0 && b <= 1))
			System.out.println(a + " и " + b + " входят в промежуток [0, 1]");
		else
			System.out.println(a + " и " + b + " не входят в промежуток [0, 1]");
	}

	private static void fromRGBtoCMYK(int r, int g, int b)
	{
		double c1 = 1 - ((double) r) / 255;
		double m1 = 1 - ((double) g) / 255;
		double y1 = 1 - ((double) b) / 255;
		double mincmy = Math.min((Math.min(c1, m1)), y1);
		int c = (int) Math.round(100 * (c1 - mincmy) / (1 - mincmy));
		int m = (int) Math.round(100 * (m1 - mincmy) / (1 - mincmy));
		int y = (int) Math.round(100 * (y1 - mincmy) / (1 - mincmy));
		int k = (int) Math.round(100 * mincmy);
		System.out.println(String.format("RGB (%d, %d, %d) конвертируется в CMYK (%d, %d, %d, %d)", r, g, b, c, m, y, k));
	}

	public static void main(String[] args)
	{
		System.out.println("a * (b + (c / d)) = " + calculate(2, 6, 7, 9));
		System.out.println(check(3, 17));
		positive(10);
		System.out.println(negative(-9));
		hello("Иван");
		year(700);
		isTrue(true, false);
		methodAB(1, 9);
		System.out.println(deleteAB(10, 5));
		partiesOfTriangle(30, 3, 3);
		getRandomAB(1, 100);
		diceRoll();
		checkSin(30);
		checkThreeNumbers(3, 3, 3);
		checkDayMonth(20, 6);
		check01(0.1, 0.99);
		fromRGBtoCMYK(134, 206, 35);
	}
}
