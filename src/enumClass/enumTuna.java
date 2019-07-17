package enumClass;

 enum weekdays
{  jan,feb,mar,apr	 
};

public class enumTuna {

	
	public static void main(String[] args) 
	{
		//all=
				weekdays[] all=weekdays.values();
				for(weekdays item:all)
				{
					//System.out.println("item="+item + "."+item.ordinal());
					int itemno=item.ordinal()+1;
					System.out.println("item="+item +";item no="+itemno);
					/*      item=jan;item no=1
							item=feb;item no=2
							item=mar;item no=3
							item=apr;item no=4
					*/
				
							
				}
	}

}
