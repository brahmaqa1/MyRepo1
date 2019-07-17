package InterviewPrograms;

public class Swap2NosUsingDivision {

	
	public static void swap(int a, int b)
	{
		System.out.println("Before  swapping a="+a + ", b="+b);
		a=a*b;// 200
		b=a/b; //  ab/ a  =b
		a=a/b; //  ab/b == a
		System.out.println("After  swapping a="+a + ", b="+b);
		
	}
		public static void main(String[] args) 
		{
		  //swap(10,20);
		  swap(20,10);
		

	}

}
