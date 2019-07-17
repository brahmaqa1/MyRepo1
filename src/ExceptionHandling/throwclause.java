package ExceptionHandling;

import java.io.IOException;

public class throwclause {
	
	public static void main(String[] args)
	{
		System.out.println("*************Starts**************************");
		
		//throw new NullPointerException("my exception data");
		//throw new IOException("my own ioexception");//error dont write code unreachable code
		
		//hanlde exception
	/*	try
		{
			throw new NullPointerException("my exception data");
		}
		*/
		try
		{
			throw new IOException("my IOException");
		}
		//note: we cant write 2 try stmts continously
	/*	catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}*/
		
		catch(NullPointerException npe)
		{
			npe.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		finally
		{
			System.out.println("in fianally");
		}
		System.out.println("*************ends**************************");	

	}
}
