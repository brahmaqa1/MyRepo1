package classbasic;

public class testobjreference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		car a=new car();//def const called
		
		car b=new car();////def const called
		car c=new car();//def const called
		
		a=b;
		/*b=c;
		c=a;*/
		System.out.println(a.name);//null -strng care*********
	System.out.println(b.name);//null
	
	a.name="Ram";
	System.out.println(a.name);//Ram
	System.out.println(b.name);//Ram
	
	b.name="sita";
	System.out.println(a.name);//sita
	System.out.println(b.name);//sita	

	}

}
