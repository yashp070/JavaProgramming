package practice;

import java.util.Scanner;

public class CheckVowelOrConsonants {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a character");
	char n=s.next().charAt(0);
	if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u') {
		System.out.println(n+" is vowel");
	}else {
		System.out.println(n+" is consonant");
	}
	s.close();
}
}
