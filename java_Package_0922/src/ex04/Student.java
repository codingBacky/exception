package ex04;

public class Student {
	private String name;
	private int age,kor,math,eng,sum;
	private double avg;
	
	public void sum() {
		this.sum = kor+math+eng;
	}
	public void avg() {
		sum();
		this.avg = sum/3;
	}
	
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setKor(int kor) { this.kor = kor; }
    public void setMath(int math) { this.math = math; }
    public void setEng(int eng) { this.eng = eng; }
   
    
	public String getName() {return name;}
	public int getAge() {return age;}
	public int getKor() {return kor;}
	public int getMath() {return math;}
	public int getEng() {return eng;}
	public int getSum() {return sum;}
	public double getAvg() {return avg;}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", kor=" + kor + ", math=" + math + ", eng=" + eng + ", sum="
				+ sum + ", avg=" + avg + "]";
	}
	}
	

