package InterviewPrograms;

public class DescendingOrder {

	public static int[] Get_Descending_Order(int a[] )
	{		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i] <a[j])
				{
					int tmp =a[i];
					a[i] =a[j];
					a[j]=tmp;		
				}
			}
		}
		return a;
	}
	//***************************
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		a=Get_Descending_Order(a);
		
		for(int val:a)
		{
			System.out.println(val);
		}

	}

}
