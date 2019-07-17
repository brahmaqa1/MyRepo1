package InterviewPrograms;

public class Swap2StringsWithoutUsingTempVariable {

	public static void main(String[] args) {
		
		String a= "Ram";// 3
		String b="Sita"; // 4
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int StrFirstLength= a.length();// 
		System.out.println("StrFirstLength="+StrFirstLength);//3
		
		a=a+b;// RamSita  // 7
		// Get val =Ram from RamSita
		//
		b= a.substring(0,a.length()-b.length() );// 0,3 =7-4
		System.out.println("b="+b);// Ram
		
		a=a.substring(b.length());// 3
		System.out.println("a="+a);
		
		
		

	}

}
