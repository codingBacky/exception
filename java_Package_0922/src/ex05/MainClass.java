package ex05;

public class MainClass {

	public static void main(String[] args) {
	
		Student[] students = new Student[3];
		int total = 0;
		double average = 0;
		students[0] = new Student("이영수", 20, 100, 80, 70);
		students[1] = new Student("김민철", 20, 80, 80, 70);
		students[2] = new Student("장민우", 20, 90, 80, 70);
	
		System.out.println("성명  나이  국어  영어  수학  총점  평균");
		//for(int i = 0; i <students.length; i++) {
		for(Student s : students) {
			System.out.printf("%s %d %d %d %d %d %.2f\n",
				s.getName(),s.getAge(),s.getKor(),s.getMath(),s.getEng(),s.getSum(),s.getAvg());
			total += s.sum();
		}
		average = (double)total/students.length;
		System.out.printf("전체 총점 : %d, 전체 평균 : %.2f", total, average);
	}

}
