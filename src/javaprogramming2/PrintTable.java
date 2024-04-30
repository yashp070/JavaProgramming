package javaprogramming2;

class PrintTable   
{  
public static void main(String args[])  
{  
int m=7; int n=10;


int result=2;


for(int i=1; i<=n; i++) {
	
	result=i*m;
	System.out.println("======================");
	System.out.println(m + " * " + i + " = "+ m * i); 
	
}
System.out.println("======================");
System.out.println(result);
  
}  
}  
