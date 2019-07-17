package InterviewPrograms;

public class Swap2NosWithoutUsingTempVariable {

	
	public static void swap_Two_Numbers(int a,int b)
	{
		System.out.println("Before  swapping a="+a + ", b="+b);
		a=a-b;
		b=a+b;		
		a= -(a-b);
		System.out.println("after swapping a="+a + ", b="+b);		
	}
	

	public static void main(String[] args) 
	{
		//
		swap_Two_Numbers(10,20);
		swap_Two_Numbers(10,25);
		swap_Two_Numbers(-1,-2);
		swap_Two_Numbers(1,-2);
		
		//****************************************
	}
}
