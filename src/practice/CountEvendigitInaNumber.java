package practice;

public class CountEvendigitInaNumber {
public static void main(String[] args) {
	int n=47987;
	int temp=n;
	int count=0;
	while(n!=0) {
		int l=n%10;
		if (l%2==0) 
			count++;
			n/=10;
	}
	System.out.println(temp+" has "+count+" even digits");
}
}
