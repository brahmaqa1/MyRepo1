package staticVariable;

class Counter{  
	//int count=0;//will get memory when instance is created  
	 static int count=0;
	Counter()//constr 
	{  
	    count++;  //1
	   System.out.println(count);  
    }  
  
public static void main(String args[]){  
  
Counter c1=new Counter();  

Counter c2=new Counter();  
Counter c3=new Counter();  
  
 }  
}

