package practice;

public class WhichKindOfCharacter {
	public static void main(String[] args) {
		char ch='8';
		if (ch>='0' && ch<='9') {
			System.out.println(ch+" is a number type");
		}else if (ch>'a' && ch<'z' || ch>'A' && ch<'Z') {
			System.out.println(ch+" is a character type");
		}else {
			System.out.println(ch+" is special character");
		}
	}

}
