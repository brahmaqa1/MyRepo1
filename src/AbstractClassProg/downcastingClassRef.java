package AbstractClassProg;

 class one
{
	void show1()
	{
		System.out.println("super class -show1");
	}
}

 class two extends one
{
	//show1() copied 
	void show2()
	{
		System.out.println("child class --show2");
	}	
}

public class downcastingClassRef 
{	
	public static void main(String[] args) 
	{		
		//ex2:downcast--  high to low-  so must explict	
		// child ref=pare ref
		//two tref=new one();// error : we must explicit
		two tref=(two)new one();
		// Exception in thread "main" java.lang.ClassCastException: AbstractClassProg.one cannot be cast to AbstractClassProg.two
		tref.show1();//not executed   //Care *****diff : atleast show1() is also not called 
		tref.show2();//not executed // show2() is not acceessible to one object
		//narrowing-we  cannot access super class and sub class methods 0% functionality
		//????????????what is the use of narrowing????
		
		
	}//main
}
