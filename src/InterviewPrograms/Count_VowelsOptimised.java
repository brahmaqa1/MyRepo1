package InterviewPrograms;

public class Count_VowelsOptimised {

	public static int Count_Vowels(String s)
	{
		char[] charArr = s.toCharArray();
		int cnt=0;
		for (char chVal: charArr)
		{		
			String sval = Character.toString(chVal);
			if (sval.toLowerCase().equals("a") ||  sval.toLowerCase().equals("e") || sval.toLowerCase().equals("i") || sval.toLowerCase().equals("o") || sval.toLowerCase().equals("u")  )
			{
					cnt++;
			}	
		
		}	
		System.out.println("Vowels Cnt="+cnt);
			return cnt;		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Count_Vowels("iA(AB");//  Care: 3  working

	}

}
