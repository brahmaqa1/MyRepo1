package Functions;

public class FunctionReturnsArray 
{
	public static void main(String[] args) 
	{
		
		String [] farray=arrfun();
		//    String [] farray= a;
		System.out.println("farray size="+farray.length);// farray size=5
		for(String val:farray)
		{
			System.out.println("val="+val);
			/*      val=Brahma
					val=Hyder
					val=001
					val=AP
					val=IND
			*/
		}

	}
	
	/*public static int  arrfun()
	public static String  arrfun()*/
	
	public static String [] arrfun()	
	{			
		String a[]=new String[5];//declare array with name "a" of type string 
		a[0]="Brahma";
		a[1]="Hyder";
		a[2]="001";
		a[3]="AP";
		a[4]="IND";
		
		return a;// array vals******care		
	}
}
