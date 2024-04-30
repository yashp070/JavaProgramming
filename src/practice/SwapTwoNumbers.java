package practice;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		temp=a+b;
		a=temp-a;
		b=temp-b;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
}
