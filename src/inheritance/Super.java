package inheritance;

class vehicle
{
	int speed=50;
	void message()
	{
		System.out.println("parent class");  
	}  
	
}

public class Super  extends vehicle
{
	int speed=100;
 
	void display()// child ass
	{
		//System.out.println("child class="+speed);//100
		System.out.println("child class="+super.speed);//50 parent clas inst var
	
		message();//local method
		super.message();//super class method
	}
	
	void message()
	{
		System.out.println("child class");  
	} 
	
	public static void main(String[] args)
	{
		Super s=new Super();
	  System.out.println("local inst var="+s.speed);//100
	 // System.out.println("parent class var ="+super.a);//eroror dont use super in static context
	  //so super should not be used in non statikc method
	   s.display();	 
	  
	   //super.message();//error dont use super in static context
	   
	}

}
