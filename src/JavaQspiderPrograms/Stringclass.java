package JavaQspiderPrograms;

public class Stringclass {

	
	public static void main(String[] args) {
		
		//***************************
		/*String s1="brahma";
		String s2=new String("nanda");
		System.out.println("s1="+s1);//brahma
		System.out.println("s2="+s2);// nanda
*/
		
		//************************
		/*
		String s1="brahma";		
		String s3="brahma";
		
		String s2=new String("nanda");
		String s4=new String("nanda");
		
		System.out.println("s1="+s1);//brahma
		System.out.println("s2="+s2);// nanda
		System.out.println("s1="+s3);//brahma
		System.out.println("s2="+s4);// nanda
		
		System.out.println(s1==s3);//true
		System.out.println(s2==s4);//Care :::fasle
		
		String s5=new String("brahma");
		System.out.println(s1==s5);//false
*/		
		//*******************
	/*	String s1="java";	// Strng const pool	
		String s3="brahma";
		
		String s2=new String("nanda");// creates new obj refee  0xjhshf //Sttring non  const pool
		String s4=new String("nanda");//creates new obj refee  0xjhsesrfswf
		String s5=new String("Rama");
		
		System.out.println(s1==s3);//false
		System.out.println(s2==s4);//false// compare obj reference address//
		System.out.println(s2.equals(s4));//true compare val in obj
*/		
		//********************************
		
	/*	String s1="java";	// Strng const pool	
		String s2="developer";
				
		String s3=s1+s2;	// Strng const pool	
		System.out.println("s3="+s3);//s3=javadeveloper
		String s4="javadeveloper";
		System.out.println(s4);//javadeveloper
		System.out.println(s3==s4);//care::: false  ?????
				
		String s5="java"+"developer";	// s5=javadeveloper
		System.out.println("s5="+s5);//s5=javadeveloper
		System.out.println(s3==s5);//false???????
		System.out.println(s4==s5);	//true????????
		
		
		String s6=s1+"developer";
		System.out.println("s6="+s6);//s6=javadeveloper
		System.out.println(s3==s6);//false
		System.out.println(s4==s6);//false
		System.out.println(s4.equals(s6));//true
*/		//**********************	
		String s1="Ram";
		int l=s1.length();
		System.out.println("length o fstr="+l);//3
		System.out.println(s1.concat("Sita"));//RamSita
		System.out.println("s1="+s1);//s1=Ram
		
		System.out.println("charat 0 ="+s1.charAt(0));//R
		System.out.println("charat 0 ="+s1.charAt(1));//a
		//System.out.println("charat 0 ="+s1.charAt(5));//String index out of range: 5
		//get all chara 
		/*for(int i)
		{
			
		}*/
		String s2="Java developer";
		System.out.println(s2.contains("av"));//true
		// if not there
		System.out.println(s2.contains("am"));//false
		
		System.out.println("s2.startsWith j="+s2.startsWith("j"));//s2.startsWith j=false
		System.out.println("s2.startsWith J="+s2.startsWith("J"));//s2.startsWith J=true
		
		System.out.println("s2.endsWith per="+s2.endsWith("per"));//s2.endsWith per=true
		System.out.println("s2.endsWith pa ="+s2.endsWith("pa"));//s2.endsWith pa =false
		
		System.out.println("s2.indexOf 0"+s2.indexOf(0));
		
		
		
		
		
		
	}

}
