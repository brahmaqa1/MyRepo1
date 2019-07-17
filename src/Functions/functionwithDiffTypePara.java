package Functions;

public class functionwithDiffTypePara {	
	
		public static void main(String[] args) 
		{
			System.out.println("in main()");
			sum(1,3);
			//sum("Ram",15);// errro invalid
			sum("Ram",15);// not stroing res into any var
					
			System.out.println("******");//care we can use *************
			
			String su=sum("Sita",25);	  //s 			
			System.out.println("su="+su);//= Sita25	
		// care****************
			//ctr+space =list out all methods in current class
					 
		}

		public static void sum(int a,int b)// with 2 para
		{
			System.out.println("in sum() int parameter");
			int c=a+b; //4
			System.out.println(c);//4
			//return; // we can use   care:***  void - dont return any val but u can use return; 
			//return 0; // error :Void methods cannot return a value
			
		}
		
		public static String sum(String a,int b)// 2 para
		{  						//a=Ram b=15
			System.out.println("in sum() string parameter ");
			String s=a+b;// Ram15
			System.out.println("s="+s);//
			//return s;
			float h=43.7f;
			//return 10;//error 
			return s;//  retutn type must be type of "string"
		}
		
}
