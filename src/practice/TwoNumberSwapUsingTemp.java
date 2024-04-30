package practice;

public class TwoNumberSwapUsingTemp {
public static void main(String[] args) {
	int a=15;
	int b=25;
	int temp;
	temp=a+b;
	a=temp-a;
	b=temp-b;
	System.out.println(a);
	System.out.println(b);
}
}
