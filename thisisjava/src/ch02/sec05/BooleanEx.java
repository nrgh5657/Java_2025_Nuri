package ch02.sec05;

public class BooleanEx {

	public static void main(String[] args) {

		boolean stop = true;
		if (stop) {
			System.out.println("중지합니다");
		} 
		else {
			System.out.println("시작합니다");
		}
	   
		int x = 21;
		boolean result1 = (x ==20);  // 변수 x의 값이 20인가?
		boolean result2 = (x !=20);  // 변수 x의 값이 20이 아닌가?
		boolean result3 = (x > 20);
		boolean result4 = (x < 0 || x > 200); // 변수 x의 갑이 0보자 적거나 200보자 큰가
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
	    System.out.println("result3: " + result3);
	    System.out.println("result4: " + result4);
	
	
	}

}
