package StaticMethods;

public class staticmethod1 
{	
	static String  sgv="Static Gv val"; //static  global var
	String nsgv="non static val1";  //non static  global var

		public static void main(String[] args)  //static method
		{		
			 System.out.println("in main");			 
			 sumStatic();
			//subNonStatic();// Cannot make a static reference to the non-static method subNonStatic() from the type staticmethod1
			 
			 staticmethod1.sumStatic();//class.static method
			 
			 //obj.staticmethod()
			 staticmethod1 sobj=new staticmethod1();
			 sobj.sumStatic();
			 
			 //calll non static method???????????????????/
			 //create obj for the current class  and call method()	 
			 staticmethod1 s1=new staticmethod1();
			 s1.subNonStaticTwo();
			 
			 sgv="Rama";//direct
			
			 
			// nsgv="new 1";// error nsgv
			 s1.nsgv="15";
			 
			 
			 s1.subNonStatic();
			 
			 
		}//mainn 
	
			public static void sumStatic() //static method
			{
				System.out.println("in sumStatic()");
				 int b=20;//non static
				//Local var in method neither  static or nonstatic???
				 
				//We cant apply static for local var		
				//static int slv=15;// error Illegal modifier for parameter slv; only final is permitted
			}	
		
			public  void subNonStatic() // non static method
			{ 
				System.out.println("******************");
				System.out.println("in subNonStatic");
				int y=20;
				//static int g=45;//error 
				//can we call static method ...
				 sumStatic();//     care:;**************diff ******???????????  ask Devendra????????????
				 subNonStaticTwo();//			 
					 sgv="Rama";
					 nsgv="new 1";// 
			}
			
		
			public  void subNonStaticTwo() // non static method
			{
				System.out.println("in subNonStatic Two");		
				 
			}	
	
}
