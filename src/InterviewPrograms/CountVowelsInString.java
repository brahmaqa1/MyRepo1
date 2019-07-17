package InterviewPrograms;

public class CountVowelsInString {

	public static int Count_Vowels(String s)
	{
		char[] charArr = s.toCharArray();
		int cnt=0;
		for (char chVal: charArr)
		{
		     
			switch(chVal)
			{
			case 'a':
					//System.out.println("t1");// Care: there is no break stmt, it goes to next case
			case 'e':
					//System.out.println("t2");
			case 'i':
			case 'o':
			case 'u':
					cnt++;
					break;
			 default: 
				//System.out.println(chVal + " -not vowel");
			}			   
		}	
		System.out.println( " - vowel=Cnt="+cnt);
		return cnt;		
	}
	
	public static void main(String[] args) {
	
		Count_Vowels("rama is");
		Count_Vowels("gr");
		Count_Vowels("AA"); /// Care:  0  handle dif way AA is not counted
		Count_Vowels("iA(A");//  Care :1  ;AA is not counted
				

	}

}
