package pack1.xyz;

import pack2.pack2class;
import login.*;// all classes from this pack

public class test {	
	public static void main(String[] args) 
	{
		loginclass logref=new loginclass();
		
		logref.loginUser();
		logref.name="ram";// 
	
		//call loginclass2 methods in login pakc
		loginclass2 log2=new loginclass2();
		log2.class2method();		
		
		//calling pack 2 class methods
		pack2class p=new pack2class();
		p.pack2classmethod1();
		
	}

}
