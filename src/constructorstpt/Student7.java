package constructorstpt;

class Student7{  
    int id;  
    String name;  
    
		    Student7(int i,String n)
		    {  
				   System.out.println("in 2 para constr");
				    id = i;  
				    name = n;  
		    }  
    
		    Student7()
		    {
		    	System.out.println("in default constr");
		    	
		    	// we can crate obj in constr
		    	System.out.println("we can crate obj in constr");
		    	Student7 sobj=new Student7(111,"Karan"); 
		    	
		    	// we can call method in constr
		    	display();// 0 null
		    	sobj.display();//111 Karan
		    }  
		    
			    void display()
			    {
			    	System.out.println("in display");   
			    	System.out.println(id+" "+name);
			    	//details();
			    }  
			    
			    public void details()
			    {
			    	System.out.println(" in details ");
			    
			    	/*   f1();
				    	public void f1() //cannot defined method in side other method()
				    	{
				    		System.out.println("in f1");
				    	}
			    	*/
			    }
			    
    public static void main(String args[])
     {  
	    Student7 s1 = new Student7(111,"Karan");  
	    Student7 s2 = new Student7();  
	    
	    s2.id=s1.id;  
	    s2.name=s1.name;  
	    s1.display();  
	    s2.display();  
    }  //Main
}  
