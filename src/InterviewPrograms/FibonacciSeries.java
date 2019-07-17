package InterviewPrograms;

public class FibonacciSeries {


	public static void main(String[] args) 
	{
		
		int n=10;
		int []fib= new int[n];
		
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2;i<=fib.length-1;i++)
		{
			fib[i]=fib[i-2]+fib[i-1];
		}

		int j=1;
		for(int val: fib)
		{
			System.out.println(j+"."+val);
			j++;
		}
		/*1.0
		2.1
		3.1
		4.2
		5.3
		6.5
		7.8
		8.13
		9.21
		10.34
		*/
		
		
		//**************
	}

}
