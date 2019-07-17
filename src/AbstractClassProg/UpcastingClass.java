package AbstractClassProg;

public class UpcastingClass {
	
	public static void main(String[] args) 
	{
	/*	//int  4B char 2B
		//widening-convert lower data type--> higher	 or upcasting
		 char ch='A';
		 int n=ch;	// no need type cast	 
		 System.out.println("n="+n);// 65 implicit typecast
		 
		 int n2=(int) ch; //
		 System.out.println("n2="+n2);//65
		 
		 //ex: widen or upcast -safe
		char ch1='A';
		int nu=ch1;
		//ex2:
		int x1=9518;
		float sal3=x;
*/		
		//ex2:upcast
		int x=9500;
		
		float sal=x;// implicit typecast --int> float widening
		System.out.println("sal="+sal);// =9500.0
		
		float sal2=(float)x;
		System.out.println("sal2="+sal2);// =9500.0
		
//downcasting--low to high -some problems
		// float to int --- narrow-downcasting-- high>low-- always some problem with higgh  to low-- should explicit type casting
		// we loose data
		float f=10.1234f;
		//int n3=f;//error: Type mismatch: cannot convert from float to int
		int n4=(int)f;// only int 
		System.out.println("n4= displays only integer part="+n4);	//10	
	}//main
}
