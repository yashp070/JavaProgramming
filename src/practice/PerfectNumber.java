package practice;

public class PerfectNumber {
public static void main(String[] args) {
	int n=22;
	int sum=0;
	for(int i=1; i<n; i++) {
		if (n%i==0) {
			sum+=i;
		}
	}
	if (sum==n) {
		System.out.println(n+" is a perfect number");
	}else {
		System.out.println(n+" is not a perfect number");
	}
}
}
