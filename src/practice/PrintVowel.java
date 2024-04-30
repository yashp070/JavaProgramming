package practice;


public class PrintVowel {
public static void main(String[] args) {
	String input ="Hello hoe are you";
	String vowels = "AEIOUaeiou";
	System.out.println("original String " + input);
	System.out.println("vowels: ");
	for(char c : input.toCharArray())
	{
		if(vowels.indexOf(c) != -1)
		{
			System.out.println(c);
		}
	}
}
}
