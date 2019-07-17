package CollectionApi;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	
	public static void main(String[] args) {
		
	/*	// create a hash set
		HashSet hs = new HashSet();
		// add elements to the hash set
		hs.add("A");
		hs.add("B");
		hs.add("B");// duplicate val -not inserted
		hs.add(null);// insert null vals 
		hs.add("D");
		hs.add(10);//heterogenous obj
		
		System.out.println("hs.add() returns ="+hs.add("B"));//false
		System.out.println(hs);//[D, null, A, B 10]    //note: not displaying specific order..
		// it wont display [AB null D 10]
		// in hash set, insertion order is not preserved,in which order we inserted...
	
		*/
		
		
	//**************************************************
	/*	HashSet hs = new HashSet();
		// add elements to the hash set
		hs.add("A");
		hs.add("B");
		int elementssize=hs.size();
		System.out.println("elementssize="+elementssize);//2
		
		hs.clear();
		System.out.println("elementssize="+hs.size());// 0
		
		hs.add("q");
		hs.add("r");
		
	System.out.println("conatins R="+hs.contains("r"));//true
	System.out.println("conatins R="+hs.contains("B"));//false

	Object objref=hs.clone();
	System.out.println("hashset cloned="+objref);// bjref cloned=[q, r]
	
	System.out.println("hs.equals(objref);"+hs.equals(objref));// true
	
	
	System.out.println("hs.isEmpty();="+hs.isEmpty());//flase
	*/
		
	//*********************************************************
		
	/*  HashSet hs = new HashSet();
	// add elements to the hash set
	hs.add("A");
	hs.add(10);
	
	Iterator itref=hs.iterator();
	
	System.out.println("itref.hasNext() returns ="+itref.hasNext());//true	
	System.out.println("next() returnns obj="+itref.next());// A
	
	
	System.out.println("itref.hasNext() returns ="+itref.hasNext());//	true
	System.out.println("next() returnns obj="+itref.next());// 10

	System.out.println("itref.hasNext() returns ="+itref.hasNext());//	false
	System.out.println("next() returnns obj="+itref.next());// Exception in thread "main" java.util.NoSuchElementException
	//care:     
	*/
		
	//*************************************
		/*
		   HashSet hs = new HashSet();
		// add elements to the hash set
		hs.add("A");
		hs.add(10);
		hs.add("C");
		
		Iterator itref=hs.iterator();
		while(itref.hasNext())
		{
		 	System.out.println("ele="+itref.next());
		 	ele=A
		 			ele=C
		 			ele=10
		 			
		}
		
		*/
		
		//2nd for loop
		
		//***********************
	/*	HashSet hs = new HashSet();
		// add elements to the hash set
		hs.add("A");
		hs.add(10);
		hs.add("C");
	
//		for(Object val:hs)			
//		{
//			System.out.println("val="+val);// A c 10			
//		}
		*/
		
	//***********************************************8
		
		
	/*	HashSet hs = new HashSet();
		// add elements to the hash set
		hs.add("A");
		hs.add(10);
		hs.add("J");
	   
		Iterator itref=hs.iterator();
		
		for(int i=1;i<=hs.size();i++)			
		{
			System.out.println("val="+itref.next());// 
			val=A
					val=10
					val=J
		}
		*/
		
	//***************************************************
	
		/* HashSet hs = new HashSet();
			// add elements to the hash set
			hs.add("A");
			hs.add(10);
			hs.add("B");
			
			hs.remove("A");
			System.out.println("after removing ="+hs);// after removing =[B, 10]
			
			hs.add("L");
			System.out.println("hset eleents ="+hs);// B L 10
			
			Object[] objarr=hs.toArray();
			
			System.out.println("objarr[0]="+objarr[0]);//B
			System.out.println("objarr[1]="+objarr[1]);//L
			System.out.println("objarr[2]="+objarr[2]);// 10
			*/
	//*******************************************
			
			
			
			
			
			
			
			
		
		//***************************************
		String x="We are learning";
		String y="mistakes happen";
		int z=1000;
		System.out.println("Java is easy. "+x+" selenium and "+y+" "+z +" times");
		//Java is easy. We are learning selenium and mistakes happen 1000 times


	}

}
