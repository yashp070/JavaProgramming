package javaprogramming2;

public class PerfectNumber {
	public static void main(String[] args) {
		{
			int sum=0;
			int n=6;
			for(int i=1; i<n; i++)
			{
				if(n%i==0)
					sum=+i;
			}
		
			if (sum==n)
				System.out.println(n+"is perfect number");
			else
				System.out.println(n+"is not a perfect number");
		}
	}

}