package inheritance;

class Vehicle3{  
		  Vehicle3()
		  {
			  System.out.println("Vehicle is created");
			  }  
	}  

public class Bike5 extends Vehicle3
{

	Bike5()
	{  
		   //super();//will invoke parent class constructor -Def const called 
		//note: even if u dont write super(), compiler adds super() by defualt**********
		
		   System.out.println("Bike is created");  
	}  
	
	public static void main(String[] args) 
	{
		Bike5 b=new Bike5(); //constr called
	}

}
