package StaticMethods;

//Program of changing the common property of all objects(static field).  

class Student9
{  
			   int rollno;  
			   String name;  
			   static String college = "ITS";  
				     
				   static void change()//static method
				   {  
				    college = "BBDIT";  
				   }  
				
				   Student9(int r, String n)//para constr
				   {  
					   rollno = r;  
					   name = n;  
				   }  
				
				    void  display ()
				    {
				    	System.out.println(rollno+" "+name+" "+college);// college static var?????/ask 
				    }  
				    
				    static void methodstatic()
				    {
				    	System.out.println("in static method()");
				    	//Care :::::static methods
				    	//System.out.println(rollno);//???? error  non static var cannot be used in static method....
				    	//Cannot make a static reference to the non-static field rollno
				    	System.out.println("static var="+college);
				    }

  public static void main(String args[])
  { 
	  Student9 s4 = new Student9 (111,"Karan"); //111 Karan ITS
	  s4.display(); 
	  
	  Student9 s5 = new Student9 (222,"Aryan");  //222 Aryan BBDIT
	  Student9.change();  //calling static method  
	  s5.display();  
	  s4.display();
	  
	  System.out.println("*************calling Static methods**************");
	  methodstatic();//diect
	  Student9.methodstatic();
	  s5.methodstatic();    
	  //note:
	  System.out.println("*************************");
	  college="Orisaa Eng college";//
	  System.out.println("sattic var college="+college);//Orisaa Eng college"
	  System.out.println("s4.college="+s4.college);//Orisaa Eng college"
	  System.out.println("s5.college="+s5.college);//Orisaa Eng college"
	  
	  
	  s4.college="Kuppam eng college";
	  
	  System.out.println("sattic var college="+college);//Kuppam eng college
	  System.out.println("s4.college="+s4.college);//Kuppam eng college
	  System.out.println("s5.college="+s5.college);//Kuppam eng college
	  
	  
	  s5.college="Andhra college ";
	  System.out.println("sattic var college="+college);//Andhra college
	  System.out.println("s4.college="+s4.college);//Andhra college
	  System.out.println("s5.college="+s5.college);//Andhra college
	  
	  
	  
  }  
}  
