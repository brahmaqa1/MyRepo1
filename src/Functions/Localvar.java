package Functions;
public class Localvar 
{
		int gv=25;
		public String pgv="pgv val";
		
		 static  String sgv="Static Gv val";
		 public static  String sgv2="Static Gv val 2";
		
				public static void main(String[] args)
				{
					System.out.println("in main");
					int lvmain1=10;
					System.out.println("lvmain1=------>"+lvmain1);//10
					
					//System.out.println("gv="+gv);// errro non static var can't be accessed in static 
					//System.out.println("pgv="+pgv);//Cannot make a static reference to the non-static field gv
					sum(2,3);
					//System.out.println("lv od sum="+lvsum1);//error lvsum1 cannot be resolved to a variable
					
					System.out.println("Static gv=------->-"+sgv);
					
					System.out.println("public Static gv=------->"+sgv2);
					
					System.out.println("sbtwnmainclass=---------->"+sbtwnmainclass);
					
					//static a=154;// should not declare 
					
				}//main
	
	//care ********************************
	static String  sbtwnmainclass="sbtwnmainclass val";
	// we cant write syso in between

	public static void sum(int a, int b)
	{				// a=2 b=3
		System.out.println("in sum------>");		
		int lvsum1=101;
		//System.out.println("get lv of amin="+lvmain1);// error 
		
         System.out.println("Static gv=------>"+sgv);		//care accessed any wheere in static method
		System.out.println("public Static gv=------>"+sgv2);// care accessed any wheere in static method
		
		//???????????????????????????
		//static String  staticlvsum="Static lv in sum()";//care error is coming???
		//Illegal modifier for parameter staticlvsum; only final is permitted???????????why		
	}	
}
