package AbstractClassProg;

class pone

{
	void show1()
	{
		System.out.println("Parent class show1 called");
	}
	
	void show3()
	{
		System.out.println(" Parent class show3() called");
	}
}

class ptwo extends pone
//class ptwo
{	

	void show1()
	{
		System.out.println("overrided in sub class show1()");
	}
	void show2()
	{
		System.out.println(" sub class show2()");
	}
}

public class UpcastClassReference2 
{	
	public static void main(String[] args)
	{
		//note:if we over ride  a method, then sub class method only executed**** diff
		//widening or upcatsing or low to higher
		// parent ref=childclass ref
		// pone poref1=(pone)new ptwo();//error : there is no  inheritance b/w 2 classes
		pone poref1=(pone)new ptwo();
		
		poref1.show1();//overrided in sub class show1()
		// note:  if not overrided- parent class methods
		//by using parent class ref,we can call child methods, which overrided
		// usually parent ref- cannot call child class methods
		
		// with out creating any obj for parent class,we can access methods of parent classs by parent ref
		poref1.show3();//access parent class method only but not sub class  show2()
		
	}//main

}
