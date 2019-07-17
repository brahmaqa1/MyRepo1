package constructorstpt;

class student
{
	//No, constructor can't be final.
	/*final student()//error Illegal modifier for the constructor in type student; only public, protected & private are permitted
	{
		System.out.println("student-def constr called");
	}*/
		
	final public void  display()//note:;::final method-cantot override but it can over load final methods
	{
		System.out.println("final diplay method()");
	}
	
	 public void  displaynonfinal()//not final method
	{
		System.out.println("final diplay method()");
	}
	
}

public class constrcannotbefinal extends student
{
		
	public void currentdisplay()
	{
		System.out.println("current class  display()");
	}

	//cant override
	/*public void  display()//care::final method //error Cannot override the final method from student
	{
		System.out.println("final diplay method()");
	}*/
	
	 public void  displaynonfinal()//not final method
		{
			System.out.println("overided on not final method --final diplay method()");
		}
	
	
	//over laoding --final methods--done
	 public void  display(int a,int b)//over loaded
	{
		System.out.println(" display() overloadded 2  args diplay method()");
	}
	 
	 public void  display(int a,String b,int c)//over loaded
		{
			System.out.println(" display() overloadded 3 args diplay method()");
		}
	 	
		public static void main(String[] args) {
			student obj=new student();	
			//display();// error static 
			constrcannotbefinal sobj=new constrcannotbefinal();
			
			sobj.currentdisplay();
			sobj.display();
	       sobj.display(2,3);
	       sobj.display(2,"Ram",4);	
	       sobj.displaynonfinal();
	
		}
}
