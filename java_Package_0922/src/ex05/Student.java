package ex05;

import lombok.Getter;

@Getter
public class Student {
	private String name;
	private int age,kor,math,eng,sum;
	private double avg;
	
	public int sum() {
		return kor+eng+math;
	}
	public double avg() {
		return ((int)(sum()/3.0)*100+0.5)/100.0;
	}
	public Student(String name, int age, int kor, int math, int eng) {
		super();
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", kor=" + kor + ", math=" + math + ", eng=" + eng + ", sum="
				+ sum + ", avg=" + avg + "]";
	}
	
}
