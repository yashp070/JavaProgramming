package javaprogramming2;
public class LeapYear 
{
	public static void main(String[] args) {
		{
			int year=2019;
			if ((year%4==0 && year%100!=0)|| year%4==0)
			System.out.println(year+"leap year");
			else
				System.out.println(year+"not a leap year");
		}
	}
}
