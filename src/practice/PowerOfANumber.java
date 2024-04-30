package practice;

public class PowerOfANumber {
public static void main(String[] args) {
	int m=5;
	int n=3;
	int power=1;
	for(int i=1; i<=n; i++) {
		power*=m;
	}
	System.out.println(power);
}
}
