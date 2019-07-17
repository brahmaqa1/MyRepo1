package classbasic;

public class testcar {

	public static void main(String[] args) 
	{
		car a=new car();// def constr 
		car b=new car();//// def constr
		car c=new car();//// def constr
		a.name="A";
		b.name="B";
		c.name="C";
		
		System.out.println(a.name);//A
		System.out.println(b.name);//B
		System.out.println(c.name);//C
		System.out.println("*********************************");
				a=b;// a refers obj ,where b refers
				b=c;// b refers the obj, where c refers
				c=a;  // c refers the obj, where a refers
		System.out.println(a.name);//B
		System.out.println(b.name);//C
		System.out.println(c.name);//B but not A *care
		
		System.out.println("*********************************");
		a.name="X changed";//  c.name also updated
		System.out.println(a.name);//X changed
		System.out.println(b.name);//C
		System.out.println(c.name);//X changed
			
	}//main
}
