package practice;

public class Swap_two_number_without_using_temp {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		b = a+b;
		a = b-a;
		b = b-a;
		System.out.println("a="+a);	
		System.out.println("b="+b);		
	}
}
