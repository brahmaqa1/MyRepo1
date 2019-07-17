package constructorstpt;

	class Student4
	{  
	    int id;  
	    String name; 	    
	    int x;
	    //String s;  
	    String s="Raju";
	    
	    Student4(int i,String n)// 2-para constr 
	    {  		// i=111  n="karan"
		    id = i;  //assign vals to instance  vars
		    name = n;  
	    }  
				void display()
				{ 
					System.out.println(id+" "+name);
				   System.out.println("x="+x);//def val for int =0
				   System.out.println("Def null val from string="+s);//null
				}  
	   
    public static void main(String args[])
		{  
    		Student4 s1 = new Student4(111,"Karan"); // 
	        Student4 s2 = new Student4(222,"Aryan");  
	        
	        s1.id=555;
	        s1.display();  //allign ment  tab
	        s2.display();  // back allignet - shft+ tab
		} //main 
	}  

