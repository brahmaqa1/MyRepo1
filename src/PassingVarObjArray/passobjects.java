package PassingVarObjArray;

public class passobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		emp obj1=new emp(10);
		emp obj2=new emp(20);
		/*System.out.println("obj1.hashCode()"+obj1.hashCode());
		System.out.println("obj2.hashCode()"+obj2.hashCode());*/
		
		check c =new check();
		System.out.println(obj1.id +"--"+obj2.id);
		c.swap(obj1, obj2);
			
		System.out.println(obj1.id +"--"+obj2.id);
		
		
	}

}
