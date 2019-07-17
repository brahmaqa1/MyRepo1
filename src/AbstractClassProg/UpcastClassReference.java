package AbstractClassProg;

/*class one
{
	void show1()
	{
		System.out.println("super class -show1");
	}
}

class two extends one
{
	//show1() copied 
	void show2()
	{
		System.out.println("child class --show2");
	}	
}*/

public class UpcastClassReference 
{
	public static void main(String[] args) 
	{
		//upcast refer
				//parent ref=childclass ref
				one oref= new two();// lower to high- explicit 			
				//
				// whys should I use parent class ref?
						// adv: with out using super- we call parent class methods******imp
				oref.show1();// super class -show1
				//oref.show2();//error Care vimp   teo class obj- has show1() show2() but it refer parent class methods*****
				//in widening, progr access  all super class methods but not sub class methods 50% functionality
				//or
				one oref2=(one)new two();// typecast not necessary   
				oref2.show1();//super class -show1
			//or
				//ex2:
				one oref3;
				oref2=new two();				
				oref2.show1();//super class -show1
				//or
				one oref4;
				oref4=(one)new two();//
				oref4.show1();//super class -show1
			
				
	}//mian
}
