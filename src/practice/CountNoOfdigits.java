package practice;

public class CountNoOfdigits {
public static void main(String[] args) {
	int n=675;
	int count=0;
	int temp=n;
	while(n!=0) {
		count++;
		n/=10;
	}
	System.out.println(temp+" has "+count+" digits");
}
}
