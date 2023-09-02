package lab.myExample.main;

import java.util.Scanner;

import lab.myExample.model.Student;

public class StudentMain {

	static Student stuArray[] = new Student[15];
	static Student stu = new Student();
	static StudentMain sMain = new StudentMain();
	static int index = 0;

	Scanner sc = new Scanner(System.in);
	String name;
	int id, age;

	public void addStudent() {
		System.out.println("Provide name of student :");
		name = sc.next();
		System.out.println("Provide id of student :");
		id = sc.nextInt();
		System.out.println("Provide age of student :");
		age = sc.nextInt();

		Student stuInput = new Student(id, name, age);

		if (!sMain.checkStudentRecord(stuInput)) {
			stuArray[index] = stuInput;
			index++;
		} else {
			System.out.println("Student Record already exist");
		}
	}

	public boolean checkStudentRecord(Student stuInput) {

		boolean b = false;
		for (Student s : stuArray) {
			if (s == null) {
				continue;
			}
			if (s.equals(stuInput)) {
				b = true;
				break;
			}
		}
		return b;
	}

	// else {
	// if (index < 15) {
	// stuArray[index] = stuInput;
	// index++;

	// } else {
	// System.out.println("index out of bound !!");

	// }

	// }

	public void dispaly() {

		for (Student s : stuArray) {
			if (s != null) {
				System.out.println(s);
			}

		}
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean access = true;

		do {
			System.out.println("1. add student \n2. display all student \n3. exit");
			System.out.println("Select choics :");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				sMain.addStudent();
				break;

			case 2:
				sMain.dispaly();
				break;

			case 3:
				access = false;
				break;

			}

		} while (access);

	}

}
