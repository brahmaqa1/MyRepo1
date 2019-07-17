package inheritance;

class Vehicle2{  
		    Vehicle2()
		   {
			  System.out.println("Vehicle is created");
			}  
	}  

public class Bike6 extends Vehicle2
{
	  int speed;  
	  
	  Bike6(int speed)
	  {  
		   //care : compiler adds super() default *********
		 
	    this.speed=speed;  
	    System.out.println(speed);  
	  } 
	
	public static void main(String[] args) 
	{	
		
		Bike6 b=new Bike6(10); //Vehicle is created  
		//10
	}
}
