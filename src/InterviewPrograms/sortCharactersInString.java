package InterviewPrograms;

import java.util.Arrays;

public class sortCharactersInString {

	public static void main(String[] args) {
		
		// A- 65
		// a- 97
		String s="javaa"; // aaajv  low to high value
		//s="javaaJ"; // Jaaajv  CARE :
		s="ZYXC"; // CXYZ  
		
		char arr[] = s.toCharArray();
		
		Arrays.sort(arr);
		
		for(char ch : arr)
		{
			System.out.print(ch);// aaajv
		}
		

		//**********************************************************
	}
}
