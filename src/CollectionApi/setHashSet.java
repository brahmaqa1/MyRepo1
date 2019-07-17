package CollectionApi;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Set s=new HashSet();
		s.add("20");
		s.add("10");
		s.add("50");
		s.add("40");
		s.add("30");
		s.add("10");
		System.out.println("Hash Set :::: "+s);// Hash Set :::: [20, 10, 30, 40, 50]
		
*/
		//****************************
		/*Set ss=new TreeSet();
		ss.add("20");
		ss.add("10");
		ss.add("50");
		ss.add("40");
		ss.add("30");
		ss.add("10");
		System.out.println("Tree Set :::: "+ss);// Tree Set :::: [10, 20, 30, 40, 50]
		*/

		//********************************
		
		Set sss=new LinkedHashSet();
		sss.add("20");
		sss.add("10");
		sss.add("50");
		sss.add("40");
		sss.add("30");
		sss.add("10");
		System.out.println("Linked Hash Set :::: "+sss);// Linked Hash Set :::: [20, 10, 50, 40, 30]

	}

}
