package ex01;

public class ex01 {

	public static void main(String[] args) {
		
		Person p1 = new Person("김용우", 20);
		Person p2 = new Person("김용우", 20);
		System.out.println(p1.equals(p2));
		/*
		 * System.out.println(p1.canEqual(p2)); System.out.println(p1.toString());
		 * System.out.println(Math.max(5, 6));
		 * Integer intj = null;//참조형이기 때문에 null을 가질수 있다.아직 참조하는 대상이 없다는 의미 int iii = 0;
		 */
	}
}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
	//Person p2 = new Person("김용우", 20);
	//Object obj = p2; downcasting을 해줘야한다.
		Person p2 = (Person)obj;
		return this.name.equals(p2.name) && this.age == p2.age;
	}
	
//	@Override
//	public String toString() {
//		return "성명: " + name + "  나이: " + age;
//	}
	
}

