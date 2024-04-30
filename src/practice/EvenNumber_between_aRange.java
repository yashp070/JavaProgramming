package practice;

public class EvenNumber_between_aRange {
	static int first(int n) {
		int even = 0;
			if(n%2==0) {
				even=even+n;
			}
		return even;
	}
public static void main(String[] args) {
	int k=10;
	for(int i=1; i<=k;i++) {
		System.out.println(i+"..."+first(i));
	}
}
}
