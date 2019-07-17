package InterviewPrograms;

public class pascaltriangle12312 {


	public static void main(String[] args) throws InterruptedException {
			
	  /*1 2 3 
		1 2 
		1 */
		
		
		/*System.out.println("starts");
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=3;i++) // Note  :  Care j should be incremented 
			// If j ++, j = is always 1 ,,  so conditionis always true ,  it is infinite loop
			{		
				 Thread.sleep(2000);
				System.out.print(j+" ");// 1111111111..... etc	 infinite loop		
			}
			System.out.println();
		}
			System.out.println("ends here");
		
			*/
			//******************************
		
		/*for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=3;j++) // Note  :  Care j should be incremented 
			// If j ++, j = is always 1 ,,  so conditionis always true ,  it is infinite loop
			{		
				 Thread.sleep(2000);
				System.out.print(j+" ");
						// i=3 , j=	123    // 
						// i=2      123    /// not correct it always displays 3 vals
						// i=3 		123
			}
			System.out.println();
		}*/
		
		
		//*******************
		
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++) // Note  :  Care j should be incremented 
			// If j ++, j = is always 1 ,,  so conditionis always true ,  it is infinite loop
			{		
				// Thread.sleep(1000);
				System.out.print(j+" ");
						// i=3 , j=	123    // 
						// i=2      12    /// not correct it always displays 3 vals
						// i=3 		1
			}
			System.out.println();
		}
		
			System.out.println("ends here");
			
			
		
		//*************************************
	}
}
