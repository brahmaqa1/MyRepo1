package ExceptionhandlingJavaTpoint;

public class Testtrycatch2 {

	
	public static void main(String[] args) {
		
		
		try
		{
			System.out.println("in try");
			int d=15/0;
			System.out.println("hi not executed");//care not executed
			System.out.println("hi not executed");//care not executed			
		}
		
		//System.out.println("hi  not executed");// should not write after try	block
		//in b/w try catch -should not write stmts
		
		catch(Exception e)
		{
			//System.out.println("d=15/0...."+d);//????why error is coming???			
			System.out.println("executed or not");	
			System.out.println(e);
		}		
		
		System.out.println("after catch block excutes");
		
		
		try{  
		      int data=50/0;  
		   }
		catch(ArithmeticException ae)
		   {
			   System.out.println(ae);
		   }  
		   System.out.println("rest of the code...");  
		}  
}
