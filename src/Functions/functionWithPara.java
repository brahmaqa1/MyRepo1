package Functions;

public class functionWithPara {

	public static void main(String[] args) {
		System.out.println("in main()");
		//sum(10);// error  sum () with 1 para meter is not deifned 
		sum(10,20);
		//to get sum val from fun
		int s=sumof2nos(1,2);
		System.out.println("return="+s);

	}

	public static void sum(int a,int b)
	{					//a=10  b=20
		System.out.println("in sum()");
		int c=a+b;//30
		System.out.println(c);//30
		// return; // we can use
		//return 0; // error 
	}
	
	public static int sumof2nos(int a,int b)
	{		//			a=1 b=2
		System.out.println("in sumof2nos)");
		int c=a+b;//3
		System.out.println(c);//3
		//return; // error 
			return c; //ok    llast   should not write any stmts after retun stmt		
		//return 797;//  0 will be returned		
		//System.out.println("not executed after return");// errro if u write any stmt after return stmt
		//System.out.println("hi");
	}	
}
