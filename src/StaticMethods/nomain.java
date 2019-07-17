package StaticMethods;

public class nomain {

	static     // block
	{
		System.out.println("*****before main static block gets executed");
		//System.exit(0);//termiantes program
		
		//System -is predeifned class name 
		//exist(0)-- static  method
		
		System.out.println("not execiuted");// not executed
		System.out.println("line");
		System.out.println("line 2");
	}
	
	//commnet- ctrl + shft +  /
	//  uncommnet- ctrl + shft +  \
	
	//Main method not found in class StaticMethods.nomain, please define the main method as:
	public static void main(String[] args)
	//public static void main(String args[])//  if dont write main --error 
	{
		System.out.println("hi");//not executed
		System.out.println("hello");
	}
	
}
