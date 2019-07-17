package inheritance;

public class bmw  extends car
{
	
	// get all var an dmethods from car class
	//public void refuel()
		
	
	
	//define construct
	public bmw()
	{
		System.out.println("in bmw constr called");
	}

	//overriding parent class methods
	public void start()
	{
	 System.out.println("bmw start() overrided");	
	}
	
	
	public void theftsafety()
	{
	 System.out.println("bmw theftsafety()");	
	}
	
	public   void stop()// available in bmw class as well as in car class..
	{
		System.out.println("in bmw.stop()");
	}

}
