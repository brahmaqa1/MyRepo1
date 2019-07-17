package InterviewPrograms;

import java.util.Scanner;

public class TableMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
			/*7*1=7
			  7*2=14  */
			//int n=5;
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
					
			for (int i=1;i<=10;i++)
			{
				System.out.println(n+"*"+i+"=="+(n*i));
			}
		 

	}
}
