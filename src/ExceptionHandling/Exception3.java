package ExceptionHandling;

public class Exception3 {


	public static void main(String[] args) 
	{
		System.out.println("*************in main()*********************");
		////	A try block must have atleast catch block or finally blcok.
		try
		{
			System.out.println("in try block");
			int n=8/0;//error comes here it goes to finally
			System.out.println("n="+n);//not executed
		} //error comes here   if we dont write finally()--it throws error
		
		//if we dont write finally()--it throws error
		finally
		{
			System.out.println("always executed");//care:dont forget:: after finally... it throws error
		}
		//System.out.println("*************ends*********************");//???? why not executed??????after exception--it wont execute
	}

}
