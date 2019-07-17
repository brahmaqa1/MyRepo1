package StaticMethods;

class A{  
	 int a=10;//non static   inst var
	 static int b=20;
	   
	 public static void main(String args[])//static method
	 {  
		//Care :: // compile error error Cannot make a static reference to the non-static field a 
	// System.out.println(a); // note:...error should  not use non static var in statci 
	  
		 System.out.println("b="+b);// 20  directly used 
	  A obj=new A();//
	  
	  obj.a=10;// non static inst var can be used by creating obj
	    System.out.println(obj.a);//10
	  //static var - in static method() 
	 }  
	}        

