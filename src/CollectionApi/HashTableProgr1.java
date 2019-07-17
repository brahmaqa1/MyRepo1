package CollectionApi;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableProgr1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable< String, String> ht= new Hashtable< String, String> ();
		
		int HSCount = ht.size();
		System.out.println("count ="+HSCount);
		Boolean isempty= ht.isEmpty();
		System.out.println("isempty= "+isempty);
		
		ht.put("A", "Apple");
		ht.put("B", "Ball");		
		ht.put("C", "CAt");
	
		
		System.out.println("ht="+ht);//ht={A=Apple, C=CAt, B=Ball}
		
		HSCount = ht.size();
		System.out.println("count ="+HSCount);//3
		 isempty= ht.isEmpty();
		System.out.println("isempty= "+isempty); // false
		
		// duplicates keys
		ht.put("B", "Dog");
		System.out.println("ht="+ht);// ht={A=Apple, C=CAt, B=Dog}  B Kye- replaced by Dog
		
		// It will not allow null values -It throws java.lang.NullPointerException
		//ht.put(null, "Ele");// It throws NullPointerException.So dont inser null vals in to hash table
		//System.out.println("ht="+ht);
		
		
		String val= ht.get("A");
		System.out.println("val="+ val); // val=Apple
		
		val= ht.get("AInvalid");// If there is no key , it displays null
		System.out.println("val="+ val); // val=null
		
		Enumeration<String> en= ht.keys();
		
		while(en.hasMoreElements())
		{
		String ks= en.nextElement();
		System.out.println("keys="+ks);
		/*		keys=A
				keys=C
				keys=B
		*/		
		
		}
		
//		ht.iterator(); //  Note:   There is no iterator() for hashtbale
		
		
		Collection<String> vals= ht.values();// Care :Collection<String>  
		System.out.println("Values="+vals);// Note: vals is collection obj Sio
		//Values=[Apple, CAt, Dog]
		
		Iterator<String> it= vals.iterator();		
		while(it.hasNext())
		{
			String eachval= it.next();
			System.out.println("eachval="+eachval);
				/*	eachval=Apple
					eachval=CAt
					eachval=Dog
				*/						
		}
		
		
		System.out.println(" ht.containsKey="+ ht.containsKey("A")); //tr
		System.out.println(" ht.containsKey="+ ht.containsKey("AInvalid")); //f
		
		
		System.out.println("containsValue= "+ ht.containsValue("Apple")); // t
		System.out.println("containsValue= "+ ht.containsValue("Invalid")); //f 
		
//		ht.put("E",null);// it wont alllo null -in val - and throws java.lang.NullPointerException
		
		System.out.println("ht="+ht);
		System.out.println(" contains="+ht.contains("A"));// f  ' ????why   even key ='A' is there
		System.out.println(" contains="+ht.contains("Apple")); //tr
		System.out.println(" contains="+ht.contains("AppleInvalid")); // f
		
		
		
		String RemoveKey= ht.remove("A");
		System.out.println("RemoveKey="+RemoveKey); // RemoveKey=Apple Care : 
		System.out.println("ht="+ht);
//		ht={C=CAt, B=Dog}
		
	
		
			
		

	}
}
