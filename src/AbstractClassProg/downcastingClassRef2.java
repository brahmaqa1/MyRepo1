package AbstractClassProg;

class ppone
{
	void show1()
	{
		System.out.println("super class -show1");
	}
}

 class pptwo extends ppone
{
	//show1() copied 
	 void show1()// overrided
		{
			System.out.println("sub class class -show1");
		}
	 
	void show2()
	{
		System.out.println("child class --show2");
	}	
}

public class downcastingClassRef2 
{
	public static void main(String[] args) 
	{
		//hight to low
		//         child ref=parentref; but here dont create object for Parent class--0% functioanlty
		ppone oref;//
		oref=new pptwo();//  here dont create object for Parent class but create obj for sub class
		//and store into parent class ref  *************100% functioanlity
		
		//pptwo tref=oref;// error cannot convert
		pptwo tref=(pptwo)oref;
		tref.show1();// sub class class -show1 - if overrided*******care
		tref.show2();	//ok	 child class --show2

	}//mian
}
