package InterviewPrograms;

import java.util.Scanner;

public class SumOfNNumbers {

		public static int sum(int n)
		{			
			int sum=0;
			for(int i=1;i<=n;i++)
			{
				sum=sum+i;	
			}
			System.out.println("Sum of "+n + " Numbers= "+sum);
			 return sum;
		}
	
	public static void main(String[] args)
	{
		sum(2);
		sum(3);
		sum(4);
	}

}
