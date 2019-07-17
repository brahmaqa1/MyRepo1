package PassingVarObjArray;

public class check {

			void swap(emp e1, emp e2)
			{
				System.out.println("e1.hashCode()="+e1.hashCode());
				System.out.println("e2.hashCode()="+e2.hashCode());
				emp temp;
					temp=e1;
					e1=e2;
					e2=temp;				
				
			}

}
