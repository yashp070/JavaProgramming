package practice;

import java.util.Scanner;

public class PrintV_C_D_SC {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String Input");
	String s = sc.nextLine();
	int v=0, c=0,d=0,sch=0;
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v++;
			 System.out.println("Vowel = " +v);
			}else {
				c++;
				System.out.println("consonant = "+ c);
			}
		}else if (ch>='0' && ch<='9') {
			d++;
			System.out.println("digits = "+d);
		}else {
			sch++;
			System.out.println("Spe Char = "+sch);
		}
	}
	sc.close();
}

}
