package InterviewPrograms;

public class PascalTriangle112123 {


	public static void main(String[] args) throws InterruptedException {
		
	/*	//112123
		for(int i=1;i<=1;i++) // i=2  2<=1 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);// 1  printed j=2 2<=1false 
				                     //12
									// 123
			}
			System.out.println();
		}*/
		
		//----------------------
		//112123
				
			/*	for(int i=1;i>=1;i++) // i=2  2>=1 3> =1 //   infinite loop as i>=1 always
				{
					for(int j=1;j<=i;j++)  //1<=2
					{
						Thread.sleep(2000);
						System.out.print(j);// 1  printed j=2 2<=1false 
						                     //12   ok  3 
											// 123
					}
					System.out.println();
				}*/
			
		for(int i=1;i<=3;i++) // i=2  2>=1 3> =1 //   infinite loop as i>=1 always
		{
			for(int j=1;j<=i;j++)  //1<=2
			{
				//Thread.sleep(2000);
				System.out.print(j);// 1  printed j=2 2<=1false 
				                     //12   ok  3 
									// 123 ..etc
			}
			System.out.println();

	  }

}

}