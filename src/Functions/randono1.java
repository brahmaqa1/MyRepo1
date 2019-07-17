package Functions;

public class randono1 {	
	public static void main(String[] args) 
	{
		//Math - predefined class
		// abs() is static methods
		int a=Math.abs(-10);
		System.out.println("abs val="+a);
		//***************************************
				System.out.println("observr the random val 0 <1");
				System.out.println(Math.random());// randoin decimal no..o <1 dispays by deefault
				double d=Math.random()*10;
				System.out.println("d="+d);
				
				double d2=Math.random()*100;
				System.out.println("d="+d2);
				
				int rno=generateRandomNumber(100);
				System.out.println("no="+rno);
				
				//MAx
				int n=Math.max(100, 20);
				System.out.println("max val="+n);//100
	}//main
	
	public static int generateRandomNumber(int n)  // 0<n<100
	{
		double  d3=Math.random()*n;//n=100
		System.out.println("d3="+d3);
	       //return d3;// error cannot convert from double to int
		// os casting 
		//int n=d3; // Type mismatch: cannot convert from 		 double to int
		int newno=(int)d3;
		return newno;
	}

}
