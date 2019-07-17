package inheritance;
 class student
{
	 student()
	 {
		 System.out.println("student class--- default constr called");
	 }
	 
	static void  display()
	 {
		 System.out.println("in display method()");
	 }
}
 
public class inheritanceConstruvtor  extends student
{	
	inheritanceConstruvtor()// curretn class constr
	{
		System.out.println("in curretn class constr --inheritanceConstruvtor");
	}
	
	public static void main(String[] args) 
	{
		inheritanceConstruvtor obj=new inheritanceConstruvtor();//???????????doubr why constr called --then inherited...only
		System.out.println("************constr called or not");
		//sobj.student();// error not inherit constr
				
		//how to call constr of other class
		System.out.println("creating obj calling default constr");
		student studobj=new student();	
		
		//calling static methods in 3 ways
		System.out.println("calling static methods in 3 ways");
		display();// note : static methods of other calss we can use directly in static methods of any class
		obj.display();	//	obj.staticmethods() note*************
		student.display();// classname.staticmethdo()-- ok
		System.out.println("***********3 times display called...............");
	}
}
