package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesFromString {

	public  static void display_Duplicates(String str)
	{
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		char[] ch= str.toCharArray();
		
		for(char val: ch)
		{
			if (!map.containsKey(val))
			{
				map.put(val, 1);
			}
			else
			{
				map.put(val, map.get(val)+1);
			}
		}
		System.out.println(map);
	}
	

	public static void main(String[] args) {
	
		display_Duplicates("Java rama");
		
		

	}

}
