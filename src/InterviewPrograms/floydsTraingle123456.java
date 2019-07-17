package InterviewPrograms;

public class floydsTraingle123456 {

	/**
		1
		23
		456
	 */
	public static void main(String[] args) {
		
		int num=1;
		for(int i=1;i<=3;i++) // i=2  2>=1 3> =1 //   infinite loop as i>=1 always
		{
			for(int j=1;j<=i;j++)  //1<=2
			{
				//Thread.sleep(2000);
				System.out.print(num);// 1  
				     num++; //2,3            // 2 3
			}
			System.out.println();

	  }
		
		

	}

}
