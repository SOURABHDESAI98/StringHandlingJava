package lab.myExample.model;

public class Student {
	private int id;
	private String name;
	private int age;

	public Student() {

	}

	public Student(int id, String name, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "name: " + name + " id:" + id + " age:" + age;
	}

	public boolean equals(Student stu) {
		return this.name.equals(stu.name) && this.id == stu.id && this.age == stu.age;
	}

}
