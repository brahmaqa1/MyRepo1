package InterviewPrograms;

public class Swap2NosUsingTempVariable {

	public static void swap( int a, int b)
	{
		System.out.println("Before  swapping a="+a + ", b="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;			
		System.out.println("After  swapping a="+a + ", b="+b);		
	}
	public static void main(String[] args) 
	{
		swap(10,20);
		swap(20,5);		
	}
}
