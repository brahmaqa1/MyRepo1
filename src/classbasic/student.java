package classbasic;

public class student {
	  String name; //inst var
	  int id ;
	  
	  public void display()
	  {
		  
		  System.out.println("in display");
	  }
		
	  
	  public void display_marks()
	  
	  {
		  System.out.println("in marks method ");
	  }
	
	
	public static void main(String[] args) 
	{
		/*	   student s1;
		   s1=new student();*/
	
	/*	int a=10;// var a of type int
		String s="Ra"; // s is var of type String
		student s1;// s1 is ref var of type --student class
		*/
		
		 //  new student();//creates obj of type student class 
/*		   new student().name="Ram";
		   new student().id=15;
		   
		   // ctrl +space
		   new student().display();//ok
		   new student().display_marks();//ok
*/		   
		  // new student();//creates obj new address		   
		   //new student();//   creates obj new address 
		  
		   
/*		   System.out.println(new student().hashCode());//366712642
		   System.out.println(new student().hashCode());//1829164700
*/		   
		   
		   student  s1=new student();//creates object  with all inst variables and mthods
						   // retunrs address  366712642
						  // s1=366712642		  
		  System.out.println("s1 obj address="+s1.hashCode());//366712642
		  
		  student s2=new student();
		  System.out.println("s2 obj address="+s2.hashCode());//1829164700
		  
		  s1=s2;  //refervar=ref2;  s2 address stored into s1 
		  //  s1=1829164700
		  		//s1 refers also s2********vimp
		  System.out.println("observe address*************** ");
		  System.out.println("s1 obj address="+s1.hashCode());//1829164700
		  System.out.println("s2 obj address="+s2.hashCode());//1829164700
		  
		  s1.name="ram";
		  s1.id=11;  
		
		  
		  System.out.println("s1.name="+s1.name);
		  System.out.println("s1.id="+s1.id);	
		  System.out.println("s2.name="+s2.name);
		  System.out.println("s2.id="+s2.id);
		  
		  
		  student s3;//create refe  only , wont create an obj
		  //System.out.println("s3 address="+s3.hashCode());//errro 
		  s3=s1;// s3 refers or points to  the obj , wheere s1 refers the obj
		  
		  System.out.println("s3.name="+s3.name);
		  System.out.println("s3.id="+s3.id);
		  
		  //s1=null;//not executed??????????t   NullPointerException
		  //System.out.println("s1 obj address="+s1.hashCode());//1829164700
		  //System.out.println("ji");
		  
			    student s4;
			//refer to s3 obj
			    s4=s3;
			    //refer s2 obj
			    s4=s2;
			    
			    //refer s1 obj
			    s4=s1;	   

	}//main

}
