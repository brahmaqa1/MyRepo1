package InterviewPrograms;

public class startPatternEqual {

	public static void main(String[] args) {
	
		String s="*";
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				//System.out.print(i);// 11111 22222 333334444455555  25 times it will run
				//System.out.print(i);
							/*11111
							22222
							33333
							44444
							55555*/
				System.out.print(s);
			}
			System.out.println();
		}

		//***********************
	}
}
