package CollectionApi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapAndHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		hm.put("A",1);
		hm.put("B", 2);
		hm.put("C", 3);
		System.out.println("hm="+hm);// hm={A=1, B=2, C=3}
		
		hm.put("A", 40); // even if we write duplicate Values --  and no error --IT overwritten
						// // hm={A=40, B=2, C=3}
		hm.put("B", 20); // // hm={A=40, B=20, C=3}
		hm.put("D", 4);	 // // hm={A=40, B=20, C=3, D=4}	
		System.out.println("hm="+hm); //hm={A=40, B=20, C=3, D=4}
		
		hm.put(null, 4); // //hm={null=4 , A=40, B=20, C=3, D=4}  Care : null vals inserted in first
		hm.put("E", null);	
		System.out.println("hm="+hm); // hm={null=4, A=40, B=20, C=3, D=4, E=null}
		//// it  has only one null key and multiple null values
		hm.put(null, 50);   // null key is overreturn
		System.out.println("hm="+hm);// hm={null=50, A=40, B=20, C=3, D=4, E=null}
		
		int hmsize= hm.size();
		System.out.println("hmsize= " +hmsize); // 6
		
//		hm.clear();
//		 hmsize= hm.size();
//		System.out.println("hmsize= " +hmsize); // 0
//		System.out.println("hm="+hm); // {}
		
		Object oref=hm.clone();
		System.out.println("oref ="+oref);//oref ={null=50, A=40, B=20, C=3, D=4, E=null}
		
		
		boolean cbool= hm.containsKey("A");
		System.out.println("containsKey A= " +cbool); // true
		
		cbool= hm.containsKey("Ainvalid");
		System.out.println("containsKey  =Ainvalid " +cbool); //false
		
		cbool= hm.containsValue(50);
		System.out.println("containsValue= 50" +cbool); // true
		
		cbool= hm.containsValue(1325);
		System.out.println("containsValue=1325 " +cbool);//f
		
		// Get 
		Set<String> setobj = hm.keySet();
		// Note : there is no hm.keys()
//		hm.keys()  // erorr 
		
		for (String KeyVal: setobj)
		{
			System.out.println("KeyVal="+KeyVal);
			
				/*	KeyVal=null
					KeyVal=A
					KeyVal=B
					KeyVal=C
					KeyVal=D
					KeyVal=E*/				
					
		}
		System.out.println("*********");
		// or 
		Iterator<String> it= setobj.iterator();
		while(it.hasNext())
		{
				String KeyVals= it.next();
			System.out.println("KeyVals="+KeyVals);
			/*		KeyVals=null
					KeyVals=A
					KeyVals=B
					KeyVals=C
					KeyVals=D
					KeyVals=E
					*/
			
		}
		
		// get all values
		
		Collection<Integer> vals= hm.values();	
		System.out.println("vals="+vals); // vals=[50, 40, 20, 3, 4, null] Care 
		Iterator<Integer> it2= vals.iterator();
		
		while(it2.hasNext())
		{
			Integer intobj= it2.next();
			//System.out.println("val="+intobj.toString()); //????nullpointer exception ????	
			//int va= intobj.intValue(); // Convert integer to int 
			//System.out.println("va="+va);
		}
		
		
		Integer valOFKey =hm.get("A");
		//System.out.println("valOFKey= "+valOFKey.intValue()); // ???
		
		hm.remove("B");
		System.out.println("hm="+hm);
		
		boolean isempty= hm.isEmpty();
		System.out.println("isempty= " +isempty);
				
		System.out.println("Ends here");
			
	}
}
