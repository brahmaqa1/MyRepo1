package InterviewPrograms;

public class ReverseOfString {

	public static String Reverse_Of_String(String s)
	{
		int sl= s.length();
		String rev="";
		char ch;
		
		for(int i=sl-1;i>=0;i--)
		{
			 ch=s.charAt(i);
			// System.out.println(ch);
			 rev=rev+ch;			
		}		
		System.out.println(rev);
		return rev;
	}
	
	public static void main(String[] args) {
		
		Reverse_Of_String("RAM");
		Reverse_Of_String("AJAX");

	}

}
