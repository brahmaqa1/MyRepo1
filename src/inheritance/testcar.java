package inheritance;

public class testcar {

	
	public static void main(String[] args) {
		// 
	/*	car c=new car();
		c.start();
		//c.theftsaefty();// not  error not avialable 
		c.stop();
		c.price=10;
		c.wheels=4;
		
		//*****************
		bmw bmwref=new bmw();
		bmwref.price=100;
		bmwref.start();// acquires parent class methods
		bmwref.stop();// this method is there in 2 classes..
		bmwref.theftsafety();
		
		bmwref.price=150;*/
		
		// calling perent class methods stop();
		//super.stop();//???????????????????????????????????????????

		/*System.out.println("**********overridden*************");
		c.start();
		bmwref.start();
		*/
		
		//******************************************
		//new car();//in car constr  called
		//new bmw();// calles parent class constr first
		//note:  Parent class constr is called 1st before calling child class constr
		/*in car constr 
		in bmw constr called*/
///3 ***********************
		// call functions of super class
		car c1=new bmw();// create a new obj of bmw class  and store reference in var c. so c points to obj of bmw..
		// c1 can access all things from bmw object
		// 2 constr called parent const called first  and then child class const called4
		/*in car constr 
		in bmw constr called*/
		
		c1.start();//bmw start() overrided
		c1.stop();//in bmw.stop()
		c1.refuel();//in car.refuel()
		//????????????????????////
		//c1.theftsafety();//???????????????bmw  cals has method theftsafety()..why is not referred  by c1.??
		
	}

}
