package InterviewPrograms;

public class PrimeNumbers {

	//*********************************
	public static boolean is_PrimeNumber(int n)
	{
		Boolean flag=true;

		if(n==0 ||n==1)
		{
			System.out.println("Number="+n + " is not  a prime number");
			return false;
		}
		
		for (int i=2;i<=n/2;i++)		
		{			
			if (n%i==0)
			{
				flag=false;
				break;
			}
		}

		if (flag )
		{
			System.out.println("Number="+n + " is  a prime number");
			return flag;
		}
		else
		{
			System.out.println("Number="+n + " is not a prime number");
			return flag;
		}
	}
	//*********************************
	
	public static void main(String[] args) {
		
		int n=30;
		is_PrimeNumber(n);
		
		for(int i=1;i<=n;i++)
		{
			is_PrimeNumber(i);	
		}
		
		
	}
}
