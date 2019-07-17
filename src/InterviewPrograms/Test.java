package InterviewPrograms;

public class Test {

	
	public static void main(String[] args) throws InterruptedException {
		
		//112123
		for(int i=1;i<=3;i++) // i=2  2<=1 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);// 1  printed j=2 2<=1false 
				                     //12
									// 123
			}
			System.out.println();
		}
		
	
}

}