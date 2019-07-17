package InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesFromStringUsingHashset {

	public static int Get_Count_Of_Given_Char_From_String(String str,char ch)
	{
		char charr[] =str.toCharArray();
		int cnt=0;
		for(char Eachchar : charr)
		{		
			if (ch==Eachchar)
			{
				cnt++;
			}
			
		}
		
		System.out.println("Charcater='" + ch+"' Count="+ cnt);
		return cnt;
	}
	
	public static String Get_Unique_Characters(String str)
	{
		Set<String> setobj= new HashSet<>();
		
		char charr[]= str.toCharArray();
		
		for (char eachchar: charr)
		{
			if (!setobj.contains(eachchar))
			{
				String s1=String.valueOf(eachchar);
				//setobj.add(eachchar);
				setobj.add(s1);				
			}
		}
		String s= setobj.toString();
		System.out.println("unique string  ="+s+" from main string="+str);//??????   why not string 
		return s;
	}
	public static void main(String[] args) {
		
		int cnt;
		cnt=Get_Count_Of_Given_Char_From_String("rama amar", 'r');
		Get_Count_Of_Given_Char_From_String("rama amar", 'a');
		Get_Count_Of_Given_Char_From_String("rama amar", 'A');
		Get_Count_Of_Given_Char_From_String("rama amar", 'm');
		Get_Count_Of_Given_Char_From_String("rama amar", 'j');
		
		//******** Get all Charavtercnt 
		
		Get_Unique_Characters("rama");
		Get_Unique_Characters("ramaamar");
		
		
		
	}

}
