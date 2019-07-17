package ExceptionHandling;
import java.io.IOException;

public class arithematicAndArrayIndexOutOfBounds {	
	
	public static void main(String[] args) 
	{
		System.out.println("******starts**************");
		try
		{
			//int b=8/0;//goes to catch
			int b=8/2;
			System.out.println("b="+b);//error is there not executes
			
			//create indexoutofbound
			int a[]={10,20,30};
			a[4]=40;//exveption come here, it goes to 2nd catch
			System.out.println("not executed");
		}
		//System.out.println("not executed");//error 
		catch(ArithmeticException ae)
		{
			System.out.println("in catch");
			System.out.println("ae="+ae);
			ae.printStackTrace();//we can trace where exception occurs which line occurs which class occurs
			//it throws console window by zero 
			//at ExceptionHandling.arithematicAndArrayIndexOutOfBounds.main(arithematicAndArrayIndexOutOfBounds.java:11)
			//pack.classname.main(class name.java.lineno)
		}
		
		//System.out.println("not executed");//error 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("printstacktrace=");
			e.printStackTrace();
			System.out.println("e="+e);
		}
		//System.out.println("not executed");//error 
		finally
		{
			System.out.println("in finally");
		}
			
		System.out.println("last it executed************");
	}//main
}//class
