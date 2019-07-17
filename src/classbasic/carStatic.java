package classbasic;

public class carStatic {

	String name;
	int price;
	
	static int wheels=4;	
	
	//int wheels=4;
	
	public static void main(String[] args) {
		carStatic c1=new carStatic();
		c1.name="Maruthi";
	     //c1.wheels=4; // common
		
		carStatic c2=new carStatic();
		c2.name="Swift";
		//c2.wheels=4;   // common
		
		//1. static var 
		System.out.println(" stat var=="+wheels);//4
				//System.out.println("non stat var="+name);// cant acecess nonstatic directly in static thod()
		//2.
		System.out.println("class.staticvar==>"+carStatic.wheels);//4  class.staticvar
		
		//3 //c1 AND C2 also acees common static var
		System.out.println("refrence.staticvar==>"+c1.wheels); //4
		System.out.println("refrence.staticvar==>"+c2.wheels);//4
		
		/*//****************************************************************
		System.out.println("**********note********");
		wheels=7;
		System.out.println(" stat var=="+wheels);  //7
		System.out.println("class.staticvar==>"+carStatic.wheels);  //7
		System.out.println("refrence.staticvar==>"+c1.wheels);  //7
		System.out.println("refrence.staticvar==>"+c2.wheels);//  //7
		
		System.out.println("**********note********");
		c1.wheels=9;
		System.out.println(" stat var=="+wheels);  //9
		System.out.println("class.staticvar==>"+carStatic.wheels); //9
		System.out.println("refrence.staticvar==>"+c1.wheels);//9
		System.out.println("refrence.staticvar==>"+c2.wheels);//9		
		//***************************************************************
		*/
		
		//************************************************************************************
		///mathods calliong
		//1
		start();
		//2
		carStatic.start();//Care:::: class contains only static var and statci msthod()
		//3
		c1.start();
		c2.start();		
		
		//non static mthod calling-- shoould create obj 
		//stop();// error
	//	carStatic.stop();// error class contains only static var and static mthods  but not non static mthods
		c1.stop();
		//Care:: with reference , we can call static mathod() and non static mthods 
		c2.stop();
		
	}	
	
	public static void start()// static 
	{
		System.out.println("in start()");
	}
	
	public void stop()
	{
		System.out.println(name+"in stop()");
	}

}
