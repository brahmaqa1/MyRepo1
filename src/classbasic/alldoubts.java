package classbasic;

public class alldoubts 
{
	public static void main(String[] args) {	
		
		 // ********************************************
		 A a = new A();// a obj contains  x var
		 B b = new B();// obj b conatains inherited  +  String x="Parent" also *care*** 
		 // b obj contains y and x also
		 
		System.out.println(a.x);//Parent
		//System.out.println(a.y);// error 
		System.out.println(b.x);//Parent
		System.out.println(b.y); //Child
	}//main		
}// all doubts class

class A
{
        String x="Parent";
}

class B extends A
{
   String y="Child";
   //  inherited  +  String x="Parent";

}

