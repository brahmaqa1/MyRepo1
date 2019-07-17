package AbstractClassProg;

abstract class Bike
{  	
	int a;
	//******** abstarct method
    abstract void run(); // no method body
   // void stop();//eror:This method requires a body instead of a semicolon
    
    //non -abstract methods or concrete methods --with body
    void stop()
    {
    	System.out.println("Parent class:in stop");
    }
    
    static void refilltank()//chk static method() cannot override--it can override***
    {
    	System.out.println("Parent class:in refill tank");
    }
 }  //end abstract class Bike
 //*******************************************************************************************   
  class Honda4 extends Bike //  extend abstract class  and impleent abstr methods
  {  
			//if run() not defined -error :The type Honda4 must implement the inherited abstract method Bike.run()
	  		void run()//abstract method run() must be defined or implemented
			  {
				  System.out.println("running safely..abstr method defined");
			  }  
			  
			  void stop()//overrideed 
			    {
			    	System.out.println("ChildClass: overrided in stop");
			    }
			  
			  static void refilltank()//overrided --chk static method() cannot override
			  //but not throwing any error
			    {
			    	System.out.println(" child Class::overrided --in refill tank");
			    }
		    
	  public static void main(String args[])
	  {  
		  //Cannot instantiate the type Bike
		   //note:::canot create obj for abstarct class*
		 //  Bike bikeobj=new Bike();//error ::Cannot instantiate the type Bike  
		  //how can we access abstract class methods...? use refer var
	/* new Honda4().run();//running safely..abstr method defined
			  //local methods -high priority but not paretn class methdos*****imp
			  new Honda4().stop();// ChildClass: overrided in stop
			  new Honda4().refilltank(); //child Class::overrided --in refill tank
*/		 
		  System.out.println("************");
		  
	   Bike pobj = new Honda4(); // 
	   //parent class =child class
	   
	   pobj.run();  //running safely..abstr method defined
	   pobj.stop();//ChildClass: overrided in stop
	   
	   //if static refilltank() is overrided,  *****care:************** vimp  diff
	   pobj.refilltank();//?? Care Parent class:in refill tank .
	   //note::incase static methd(),it wont call child class methods.
	   
	   //class.staticmsthod()
	   Bike.refilltank();//Parent class:in refill tank
	   //super.refilltank();//error: note: canot be  used in super in static context.****imp
	   
	   Honda4 chobj=new Honda4();
	   chobj.refilltank();//"overrided --in refill tank..** calling child class method--
	   //local method -high priority	    
	  
	  }  
 }  
