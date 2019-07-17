package Functions;

import java.util.Random;

public class Random2 
{
	public static void main(String[] args)
	{
		Random r=new Random();
		System.out.println(r.nextInt());//generates random integer no.....
		
		int y=r.nextInt(100);
		System.out.println("r.nextint="+y);// 0-99 only	
		
		/*   String s="true";
		if (s==true)// Error Incompatible operand types String and boolean 			
		{
			
		}
		System.out.println("hi");
		*/
		
		
	}
}
