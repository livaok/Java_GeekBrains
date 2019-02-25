package ru.liva.lesson_5;

import ru.liva.lesson_6.Animal;
import ru.liva.lesson_6.Cat;

/**
 * @author liva
 */

public class Person {
	public String surname;
	public String name;
	public String fatherName;
	public String position;
	public String email;
	public String phoneNumber;
	public int    salary;
	public int    age;

	public Person() {
		surname = "xxx";
		name = "xxx";
		fatherName = "xxx";
		position = "xxx";
		email = "xxx@gmail.com";
		phoneNumber = "+7-xxx-xxx-xx-xx";
		salary = 0;
		age = 0;
	}

	public Person(String surname, String name, String fatherName, String position,
	              String email, String phoneNumber, int salary, int age) {
		this.surname = surname;
		this.name = name;
		this.fatherName = fatherName;
		this.position = position;
		this.email = email;
		this.phoneNumber = phoneNumber;
		setSalary(salary);
		setAge(age);
	}

	public void setAge(int age) {
		if (age <= 0) {
			age = 0;
		}
		else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public void setSalary(int salary) {
		if (salary <= 0) {
			this.salary = 0;
		}
		else {
			this.salary = salary;
		}
	}

	public int getSalary() {
		return salary;
	}

	public static void printInfo(Person person) {
		System.out.println(String.format("ФИО: %s %s %s\nДолжность: %s\n" +
						"Почта: %s\nТелефон: %s\nЗарплата: %s\nВозраст: %s\n",
				person.surname, person.name, person.fatherName, person.position,
				person.email, person.phoneNumber, person.getSalary(), person.getAge()));
	}

	public static void main(String[] args) {
		Person[] person = new Person[5];
		person[0] = new Person("Алексеев", "Егор",
				"Иванович", "инженер", "aei@gmail.com",
				"+7-977-878-88-09", 70000, 40);
		person[1] = new Person("Котов", "Иван",
				"Дмитриевич", "генеральный директор", "kid@gmail.com",
				"+7-909-999-45-54", 350000, 56);
		person[2] = new Person("Лыков", "Евгений",
				"Петрович", "инженер", "lep@gmail.com",
				"+7-976-73-56", 75000, 23);
		person[3] = new Person("Носик", "Ульяна",
				"Николаевна", "секретарь", "nun@gmail.com",
				"+7-954-654-56-77", 40000, 20);
		person[4] = new Person("Петров", "Михаил",
				"Ильич", "младший инженер", "pmi@gmail.com",
				"+7-934-565-77-45", 52000, 34);
		for (int i = 0; i < person.length; i++) {
			if (person[i].age >= 40) {
				printInfo(person[i]);
			}
		}
	}
}
