package practice;

public class FactorialBetweenARange {
public static void main(String[] args) {
	int n=5;
	for(int i=1; i<=n; i++) {
		int fact=1;
		for(int j=1; j<=i; j++) {
			fact*=j;
		}
		System.out.println(i+" factorial "+fact);
	}
}
}
