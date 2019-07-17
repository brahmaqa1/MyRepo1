package CollectionApi;

import java.util.ArrayList;
import java.util.List;

public class arrayList1 {

	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		//import jva.util
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("B");// note: arrlist- we can add duplicate values
		al.add(10);
		al.add(true);
		int alsize=al.size();
		System.out.println("al.size()="+al.size());// 4
		
		
		//al.get(0);//chk return type
		System.out.println(al.get(0));//note: returrns obj at index o
		
		// display all from arraylist
				System.out.println("all objects from list:"+al);// all objects from list:[A, B, C, B]
		
		al.remove(0);// remove obj at index -0
		System.out.println("al.size()="+al.size());//3 
		System.out.println(al.get(0));//note: returrns obj at index -B
		
		al.remove("B");
		System.out.println("al.size()="+al.size());//2
		System.out.println(al.get(0));//note: returrns obj at index -C
		
		
		
		//al.removeAll();//?/ how to use
		
		// display all from arraylist
		System.out.println("all objects from list:"+al);// all objects from list:[C, B]
		
		//******************************
		
		List<Integer> l=new ArrayList<Integer>();
//		l.add(false);// error 
		l.add(20);
//		l.add(30.123);// error 
//		l.add("40");// error 
//		l.add("50");// error 
//		l.add("10");// error 
		
	//	l.get(0);
		System.out.println(l);//  [20]
		
		
		
	}

}
