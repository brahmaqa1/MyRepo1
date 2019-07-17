package CollectionApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listinterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List lst=new ArrayList<>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("C");//duplicate val
		System.out.println("alst count using list inetrface="+lst.size());
		
		//dispolay all objec
		System.out.println("all objects="+lst);//all objects=[A, B, C, C]
		
		Iterator it=lst.iterator();
		System.out.println(it.hasNext());// true 
		System.out.println(it.next());// returrns obj- A  -String is class -obj
		
		System.out.println(it.hasNext());// true 
		System.out.println(it.next());// B
		
		System.out.println(it.hasNext());// true 
		System.out.println(it.next());// C
		
		System.out.println(it.hasNext());// true 
		System.out.println(it.next());//  C again duplicate
				
		System.out.println(it.hasNext());// false, we have 4 objects only
		System.out.println(it.next());// Exception in thread "main" java.util.NoSuchElementException
		

	}

}
