package practice;

public class CheckLeapYear {
	public static void main(String[] args) {
/*		int y=2008;
		if (y%4==0 && y%100!=0) {
			System.out.println(y+" is a leap year");
		}else if (y%400==0) {
			System.out.println(y+" is a leap year");
		} else {
			System.out.println(y+" is not a leap year");
		}
		*/
	int y=2006;
	if ((y%4==0 && y%100!=0) || y%400==0) {
		System.out.println(y+" is a leap year");
	}else {
		System.out.println(y+" is a not leap year");
	}
	}
}
