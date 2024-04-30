package javaprogramming2;

public class SumOFEvenNum {
	public static void main(String[] args) {
		{
			int sum=0;
			int n=10;
			for(int i=1; i<=n; i++)
			{
				if(n%i==0)
					sum+=i;
			}
			System.out.println(sum);
		}
	}

}
