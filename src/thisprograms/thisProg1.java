package thisprograms;

public class thisProg1 {
	int id;
	String name;

	thisProg1(int sno,String sname)/// without this()
	{
		int x=33;
		
		id=sno;//10 
		name=sname;//ram
		System.out.println("x="+x);
	}
	
	// errror ::same consr with same type parameters 
	/*thisProg1(int idno,String sname)/// without this()
	{
		id=idno;
		name=sname;
	}*/
	
	thisProg1(String name,int id)/// without this()
	{
		
		id=id;
		name=name;
	}
	
	thisProg1(int a,int id,String name)/// without this()
	{
		
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+","+name);
	}
	
	public static void main(String[] args) {
		 
		System.out.println("in main()");
		thisProg1 obj=new thisProg1(10,"Ram");
		obj.display();
		
		thisProg1 obj2=new thisProg1("sita",20);
		obj2.display();
		
		thisProg1 obj3=new thisProg1(11,12,"Ammar");
		obj3.display();
	}
}
