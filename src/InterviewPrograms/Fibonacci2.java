package InterviewPrograms;

public class Fibonacci2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int n=1;
		int c;
		while(n<10)
		{
			c=a+b;
			a=b;
			b=c;
			n++;
			System.out.println(c);
		}
		*/
		//***************
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		
		while(c<10)
		{ 
			a=b;
			b=c;
			System.out.println(c);
			c=a+b;
			/*0
			1
			1
			2
			3
			5
			8*/
			
		}

	}

}
