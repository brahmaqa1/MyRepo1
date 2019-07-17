package InterviewPrograms;

import java.util.HashMap;

public class HashMapAndHashTableDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap< String, Integer> hm = new HashMap< String, Integer> ();
		
		hm.put("bread", 1);
		hm.put("and", 2);
		hm.put("bread", 3);// duplicate leys are nopt allowed
		hm.put("bread", 1);// duplicate leys are nopt allowed
		System.out.println("hm="+hm);// hm={bread=1, and=2}
		
		//**************
		hm.put(null, 5);
		hm.put(null, null);// IT should not store null, null vslues ????
		
		hm.put("nend", 6);
		System.out.println("hm="+hm);
		// hm={null=null, bread=1, and=2, nend=6}  '??? Care 
		
		Integer m= hm.get("bread");
		System.out.println("m=" +m);// 1
			
		 m= hm.get("and");
		System.out.println("m=" +m);// 2
		
		Boolean hmcont= hm.containsValue(1);
		System.out.println("hmcont= " +hmcont);// true 
		
		hmcont= hm.containsValue(10);
		System.out.println("hmcont= " +hmcont);// false
		
	

	}

}
