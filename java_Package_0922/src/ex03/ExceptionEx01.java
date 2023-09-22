package ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx01 {
	public static void main(String[] args) {
		System.out.println("예외처리1");
		System.out.println("예외처리2");
		System.out.println("예외처리3");
		System.out.println("예외처리4");
		
		Scanner sc = new Scanner(System.in);
		System.out.println(">> 정수입력(0 이외의 숫자)");
		
		try {
			int num = sc.nextInt();//정수가 아닌 다른 타입의 입력,,,
			System.out.println("출력되나?");//오류 발생한 이후의 try문에 작성된 코드는 동작하지 않는다.
			System.out.println(5/num);//정수중에 0은 연산불가능,,,
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println(e.getMessage());
		
//		} catch (InputMismatchException e) {
//			System.out.println(e.getMessage());
//		
//		}catch (RuntimeException e) {
//			System.out.println(e.getMessage());
//				
//			
		}finally {
			System.out.println("예외처리 종료");
		}
		
		System.out.println("예외처리5");
		System.out.println("예외처리6");
		System.out.println("예외처리7");
		System.out.println("예외처리8");
		System.out.println("프로그램 종료");
	}

}
