package JavaFAQPart1;

public class DefaultValues2 {
	//int p;
	
	static int a; //static var only we can use main methdo
	//static var used in stat method
	//float f=10.856;//error care
	static float f1;
	static char ch;
	static String s;	
	static boolean b;
	//int ar[2];//errro
	static int[] arr=new int[1];
	//arr[0]=10;
	//arr[1]=20;// errro out o fbounds	
	
	
	static int  h=2;
	/*static int g;//care :::**********??????????????????
	g=15;//Carew
*/	
	int bg=15;
	
	public static void main(String[] args) {
		//Care : 
		//System.out.println("Defaul val for int="+p);//error Cannot make a static reference to the non-static field p
		System.out.println("Defaul val for int="+a);//0
		System.out.println("Defaul val for float="+f1);// 0.0
		System.out.println("Defaul val for char="+ch);//empty
		System.out.println("Defaul val for string="+s);//null
		//System.out.println("Defaul val for boolean="+b);//defualt fal.se 
		//errorcare The local variable b may not have been initialized
		System.out.println("Defaul val for arr="+arr[0]);// 0 if not initialised
		//System.out.println("Defaul val for arr="+arr[1]);//error	}
	}
		

}
