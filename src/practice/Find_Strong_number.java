package practice;

public class Find_Strong_number {
public static void main(String[] args) {
	int n=56;
	int temp=n;
	int sum=0;
	while(n!=0) {
		int l=n%10;
		sum=sum+fact(l);
		n/=10;
	}
	if (sum==temp) {
		System.out.println(temp+" is a Strong Number");
	}else {
		System.out.println(temp+" not a strong number");
	}
}
public static int fact(int n) {
	int fact=1;
	for (int i = 1; i <=n; i++) {
		fact*=i;
	}
	return fact;
}
}
