package enumClass;

import enumClass.week.Beer;

class FreshJuice{
	enum FreshJuiceSize{ SMALL, MEDUIM, LARGE } 
	FreshJuiceSize size; 
	}

class week
{
	enum weeks{jan,feb};
	
	enum Beer
	{
	KF, RC, KO, FO;
	}
}



public class FreshJuiceTest {

	/*Enums were introduced in java 5.0. Enums restrict a variable to have one of only a few predefined values. 
	 * The values in this enumerated list are called enums. With the use of enums, it is possible to reduce the number of bugs in your code.
	 *  For example, if we consider an application for a fresh juice shop, it would be possible to restrict the glass size to small,
	 *   medium and large. 
	This would make sure that it would not allow anyone to order any size other than the small, medium or large.
	*/
	public static void main(String[] args) {
		// 
		FreshJuice juice =new FreshJuice();
		juice.size =FreshJuice.FreshJuiceSize.MEDUIM ;
		
		System.out.println("juice.siz="+juice.size);
		System.out.println(""+week.weeks.jan);
		System.out.println(""+week.Beer.FO);
		//week.Beer.FO;

	}

}
