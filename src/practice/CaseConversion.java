package practice;

import java.util.Scanner;

public class CaseConversion {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a alphabet");
	char ch=s.next().charAt(0);
	if (ch>='A' && ch<='Z') {
		System.out.println((char)(ch+32));
	}else if (ch>='a' && ch<='z') {
		System.out.println((char)(ch-32));
	}else {
		System.out.println("invalid");
	}
	s.close();
}
}
