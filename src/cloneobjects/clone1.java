package cloneobjects;

class emp implements Cloneable
{
	int id;
	String name;
	emp(int id,String namme)
	{
		this.id=id;
		this.name=name;
	}
	
	public Object myclone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
}

public class clone1 {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		emp e1=new emp(10,"ram");
		emp e2=(emp)e1.myclone();
		System.out.println("e1 hash code="+e1.hashCode());
		System.out.println("e1 hash code="+e2.hashCode());
		
		

	}

}
