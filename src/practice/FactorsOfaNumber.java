package practice;

public class FactorsOfaNumber {
	public static void main(String[] args) {
		int n=4;
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				System.out.println(i);
			}
		}
	}
}
