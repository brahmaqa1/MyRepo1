package AbstractClassProg;

public class downCasting {

	public static void main(String[] args)
	{
		//downcasting oer narrowinf --low to high -some problems
				// float to int --- narrow-downcasting-- high>low-- always some problem with higgh  to low-- should explicit type casting
				// we loose data
				float f=10.1234f;
				//int n3=f;//error: Type mismatch: cannot convert from float to int
				int n4=(int)f;// only int 
				System.out.println("n4= displays only integer part="+n4);	//10
		//ex2:
			int n=65;
			//char ch=n;	//error:Type mismatch: cannot convert from int to char
			char ch=(char)n; //convert int to char high to low-so explictly	
			System.out.println("ch="+ch);//A
		//ex3:
			double d=12.484;
			//int n2=d;// error must typecast explicit
			int n3=(int)d; /// high to low -must typecast
					System.out.println("n3 onlt int part="+n3);//12
					
	}//main
}
