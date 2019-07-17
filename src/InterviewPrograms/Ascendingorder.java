package InterviewPrograms;

public class Ascendingorder {

	public static int[] Ascending_Order(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int tmp= a[i];
					a[i] =a[j];
					a[j]= tmp;							
				}
			}
		}
		 return a;
	}	
	//***************************
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,3,2,1,5,6};
		a =Ascending_Order(a);
		//**********
		for(int val: a)
		{
			System.out.println(val);
		}
		
	}
}
