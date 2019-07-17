package StaticMethods;

public class StaticBlock {
	int a=10;
	static int b=20;
	static int c;
	
	static
	{
		System.out.println("Hi Static block gets executed before main()");
		//System.out.println("a="+a);// error  non staic var canot be used in
		System.out.println("b="+b);// 20
		System.out.println("c="+c);//0  def val
	}
	
	static
	{
		System.out.println("static block 2");
		System.out.println("static block 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main()");

	}
	
	static
	{
		System.out.println("static block 3 after main ");
		System.out.println("static block 3 after main");
	}

}
