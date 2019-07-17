package staticVariable;

class staticvar{  
	   int rollno;  
	   String name;  
	   static String college ="ITS";  
	     
	   staticvar(int r,String n)
	   {  
	   rollno = r;  
	   name = n;  
	   }  
	   
	 void display ()
	 {
		 System.out.println(rollno+" "+name+" "+college);
	}  
	  
	 public static void main(String args[])
	 {  
	 staticvar s1 = new staticvar(111,"Karan");  
	 
	 staticvar s2 = new staticvar(222,"Aryan");  
	 
	 s1.college="Orisaa Eng college name";
	 s1.display();  
	 
	
	 s2.display();  
	 }  
	}  


