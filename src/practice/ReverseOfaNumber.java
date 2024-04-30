package practice;

public class ReverseOfaNumber {
public static void main(String[] args) {
	int n=345;
	int temp=n;
	int rev=0;
	while(n!=0) {
		rev=rev*10+n%10;
		n/=10;
	}
	System.out.println("reverse of "+temp+" is "+rev);
}
}
