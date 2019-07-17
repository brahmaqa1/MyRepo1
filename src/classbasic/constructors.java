package classbasic;


/*class  car  is defined already in this package ...
{
	
	
	
}*/
////car class in under same pack

public class constructors {
		
	String cobj="Raju";
	public static void main(String[] args) {
		
		car a=new car(); //car class in under same pack
		car b=new car();
		car c=new car();
		a.name="A";
		System.out.println(a.name);
		car d=new car("Jaguar",5800000);// 2 para constr  claled
		car k=new car("santro",1000);// 2 para const 
		
		d=k;//   
		
		System.out.println(d.name);// Jaguar		    /null --string if not assigned any val
		System.out.println(d.price);// 5800000   //0 
		
		car e=new car("Jaguar",5800000);
		
	}

}
