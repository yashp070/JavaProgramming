package practice;

import java.util.Scanner;

public class CheckNumberIsPositiveOrNegative {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number :");
		int n =s.nextInt();
		if (n>0) {
			System.out.println(n+" is positive");
		}else if (n<0) {
			System.out.println(n+" is negative");
		}else {
			System.out.println(n+" is zero");
		}
		s.close();
	}
}
