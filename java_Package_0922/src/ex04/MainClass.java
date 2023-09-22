package ex04;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int total = 0;
		double average = 0;
		Student[] students = new Student[3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
		        students[i] = new Student();  // 각 배열 위치에 새로운 학생 객체를 생성

		        System.out.print("이름: ");
		        students[i].setName(scan.nextLine());

		        System.out.print("나이: ");
		        students[i].setAge(scan.nextInt());

		        System.out.print("국어 점수: ");
		        students[i].setKor(scan.nextInt());

		        System.out.print("수학 점수: ");
		        students[i].setMath(scan.nextInt()); 

		        System.out.print("영어 점수: ");
		        students[i].setEng(scan.nextInt()); 
		        
		        students[i].sum();
		        students[i].avg();
		        
		        total += students[i].getSum();
		        average += students[i].getAvg();
		        
		        
		        
		}
		scan.close();
		/*
		 * for(int i = 0; i < students.length; i++) {
		 * 
		 * System.out.println("이름: " + students[i].getName() + "나이: " +
		 * students[i].getAge() + "국어 점수: " + students[i].getKor() + "수학 점수: " +
		 * students[i].getMath() + "영어 점수: " + students[i].getEng()); }
		 */
		for(int i = 0; i < students.length; i++) 
		System.out.println(students[i].toString());
		
		System.out.println(total);
		System.out.println(average/3);
		
	
	}

}
