package javaprogramming2;

import java.util.Scanner;
public class FindCharacter
{
    private static Scanner s;

	public static void main(String[] args) {
        {
            s = new Scanner(System.in);
            char ch=s.next().charAt(0);
            if (ch>='0' && ch<='9')
                System.out.println(ch + "is number");
            else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
                System.out.println(ch + "is alphabet");
            else
                System.out.println(ch + "is special character");
        }
    }
}

