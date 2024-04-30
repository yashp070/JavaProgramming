package practice;

public class Factorial_Between_a_Range {
	static int fact(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
public static void main(String[] args) {
	int k=5;
	for(int i=1;i<=k;i++) {
		System.out.println(fact(i));
	}
}
}
