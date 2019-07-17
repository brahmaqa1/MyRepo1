package ExceptionHandling;

import java.lang.*;
public class exceptionHandle1 {

	
	public static void main(String[] args) {
	
		/*System.out.println("after exception-no stmts are execiuted");
		int n=8;
		int i=n/0;
		
		System.out.println("i="+i);
		System.out.println("not execiuted");
		System.out.println("not execiuted");*/		
		
		//***********************************
		System.out.println("after exception-no stmts are execiuted");
		try {
			
			int n=8;
			int i=n/0;
			System.out.println("i="+i);
			System.out.println("not execiuted");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error in cathc");
			//e.printStackTrace();
			System.out.println("error in cathc 2");
			
		}
		
		//System.out.println("after catch.. execiuted");//Care:in b/w catch &finally- should not have stmts
		
		finally
		{
		 System.out.println("in finallyy- always executed");	
		}
		
		

	}

}
