package ch03.sec02;

public class OperatorEX {

	public static void main(String[] args) {

		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 +v2;
		System.out.printf("result1= %d\n", result1);
		
		long result2 = v1+v2-v4;
		System.out.printf("result2= %d\n", result2);
		
		double result3= (double) v1/v2;
		System.out.printf("result3= %f\n", result3);
		
		int result4 = v1%v2;
		System.out.printf("result4= %d\n", result4);
		
				
	}

}
