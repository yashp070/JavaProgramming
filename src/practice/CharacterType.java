package practice;

import java.util.Scanner;

public class CharacterType {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter any kind of character");
	char ch=s.next().charAt(0);
	if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
		System.out.println(ch+" is a character");
	}else if (ch>='0' && ch<='9') {
		System.out.println(ch+" is a number");
	}else {
		System.out.println(ch+" is a special character");
	}
	s.close();
}
}
