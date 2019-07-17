package arrayFirst1;

public class ObjectArray {	
	public static void main(String[] args) 
	{
		//int array-- stores int vsl
		//string array- only str vals
		
		//   object is builtin class  and it is super class of all the classes
		//So we can store diff values in object array…

		Object [] a=new Object [6];// max 6 vals  a[0]-----a[5] only
		a[0]=10;
		a[1]=10.8512f;
		a[2]=12.123456789;
		a[3]='A';
		a[4]="Raju";
		//a[5]="ram";
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//care**************************************
		//if not intialised a[5], it has " null 
	}
}
