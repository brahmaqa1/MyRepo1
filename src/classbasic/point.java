package classbasic;

//int x=10;// error we cant decalre outside of class
public class point {
	int x;
	int y;
	
	public static void main(String[] args) {
		
		point p=new point();
		p.x=10;
		p.y=20;
		System.out.println(p.x+" - "+p.y);// 10  20
		swap(p.x,p.y);
		System.out.println(p.x+" - "+p.y);// 10  20 changes not reflceted ouside
		System.out.println("************");
		
		//Care::::: pass reference p  as argument
		swapvals(p);
		
		swap(p);// method overlaoding
		System.out.println(p.x+" - "+p.y);////20 -- 10
		System.out.println("************");
	}//main
	
	public static void swap(int a,int b)	//pass by val
	{
		System.out.println("in swap()");
		System.out.println(a+" - "+b);// 10 - 20
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" - "+b);//20 - 10
		
	}
	
	public static void swapvals(point t)  //PAss by reference
	{
		System.out.println("in swapvals ");
		System.out.println(t.x+" - "+t.y);// 10 -20
		int temp=t.x;
		t.x=t.y;
		t.y=temp;
		System.out.println(t.x+" - "+t.y);//20 -- 10
	}	
	
	// methdo overlaoidn
	public static void swap(point t)  //PAss by reference
	{
		System.out.println("in swapvals ");
		System.out.println(t.x+" - "+t.y);// 10 -20
		int temp=t.x;
		t.x=t.y;
		t.y=temp;
		System.out.println(t.x+" - "+t.y);//20 -- 10
	}	
	
}// point class
