package practice;

public class Precondition {
public static void main(String[] args) {
	int a=5;
	int b=0;
	
	a=a++ + a++ + ++a + a-- + a --;
	System.out.println(a);
	System.out.println(b);
}
}
