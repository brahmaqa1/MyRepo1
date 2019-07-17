package constructorstpt;


class Student6
{  
    int id;  
    String name;  
		    Student6(int i,String n)
		    {    //i=111 n=karan
			    id = i;  
			    name = n;  
		    }  
      
			    Student6(Student6 s)
			    {  	//  s=s1 /// s also refers obj where s1 refers to 
			    	System.out.println("s.hasho code="+s.hashCode());//101
				    id = s.id;  
				    name =s.name; 
				   // s.display(); 
			    }  
			    void display()
			    {
			    	System.out.println(id+" "+name);
			    }  
   
    public static void main(String args[])
   {     
    	    
    Student6 s1 = new Student6(111,"Karan"); 
    // 			s1=1055445
    
    System.out.println("s1 hash code="+s1.hashCode()); //101   
    Student6 s2 = new Student6(s1);  //care ::
		   /* Student6 s3 = new Student6(s1); 
		    Student6 s4 = new Student6(s1); 
		    Student6 s5 = new Student6(s1);*/ 
    
    // int a;
    //flaot b;
    
    //  classname refervar;
    //   Student6 s; //  s -is refer var of type "student6" class
    
    s1.display();  
    s2.display();  
    
	/* Student6 snew ;
	    System.out.println(snew.hashCode());// error 
    */
    
    
   }  
}  
