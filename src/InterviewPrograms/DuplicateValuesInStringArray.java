package InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

import CollectionApi.hashset;

public class DuplicateValuesInStringArray {

	
	public static void main(String[] args) {
		
		String[] sarr=new String[] {"Java","Hiebarnate","Java","Spring","Spring","Java"};
		//Care  : new String[] {
		
		Set duplicateSet=new HashSet<>();
		Set NonDuplicateSet = new HashSet<>();
		
		for (String sval: sarr)
		{
			if (!NonDuplicateSet.contains(sval))
			{
				NonDuplicateSet.add(sval);
			}
			else
			{
				duplicateSet.add(sval);
			}
			
		}
		
		System.out.println("duplicateSet="+duplicateSet);// duplicateSet=[Java, Spring]
		System.out.println("NonDuplicateSet="+NonDuplicateSet);// NonDuplicateSet=[Java, Hiebarnate, Spring]
				
		
//************************
	}

}
