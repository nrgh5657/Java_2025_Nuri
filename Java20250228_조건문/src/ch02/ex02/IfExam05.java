package ch02.ex02;

public class IfExam05 {

	public static void main(String[] args) {
/*
 * 학점 계산
 * 90 : A
 * 80 : B
 * 70 : C
 * 60 : D
 * 59이하 F
 */
		int grade = 95;
		
		if(grade>=90) {
			System.out.println("A");
		} else if(grade>=80) {
			System.out.println("B");
		} else if(grade>=70) {
			System.out.println("C");
		} else if(grade>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		System.out.println("종료");
		
		
		
	}

}
