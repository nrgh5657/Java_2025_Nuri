package ch02.sec01;

public class VariableEx4 {

	public static void main(String[] args) {
      int a = 10;
      int b = 20;
      int c = 30;
    System.out.println("before: "); 
    System.out.println("a: "+ a + ", b: " + b + " c: " + c);
	
	 int d = a;
	 a = b;
	 b = c;
	 c = d;
	 
	 System.out.println("\nafter: ");
	 System.out.println("a: " + a + ", b: " + b + " c: " + c);
	 System.out.println("d: " + d);	
	 
	
	
	
	
	}

}
