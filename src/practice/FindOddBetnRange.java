package practice;

import java.util.Scanner;

public class FindOddBetnRange {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter start number");
	int start=s.nextInt();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter end number");
	int end=sc.nextInt();
	int count=0;
	for (int i = start; i <= end; i++) {
		if (i%2!=0) {
			count++;
			System.out.println(i);
		}
	}
	System.out.println(count+" odd numbers present");
	s.close();
	sc.close();
}
}
