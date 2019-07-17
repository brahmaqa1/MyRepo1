package arrayFirst1;

public class arrayint {	
	public static void main(String[] args) {
		
	  // int  c[5]; // errro   
		
		int a[];// without  size 
		a=new int[2]; // max 2 vals  a0 a1
		//or
		int b[]=new int[2];///*************easy ************
		//or 
		/*  int b[];
		    b=new int[2];  */
		
		a[0]=10;
		a[1]=20;
		
		//cannot store string into int val in int array
		//a[1]="ram";//Type mismatch: cannot convert from String to int**********
		//char [] ch=new char[];// error  size we should give 
		
		char [] ch=new char[2];// max 2 ch[1] ch[1] only
		ch[0]='A';  // should ecnlose in single quotes
		//ch[1]='Raja'; // eroor
		ch[1]='B';
		
		// get length of array		
		System.out.println(ch.length);//2
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(ch[i]);
		}
			
	
	}

}
