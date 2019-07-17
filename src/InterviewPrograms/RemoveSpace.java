package InterviewPrograms;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = "India     Is My    Country";  
		String str = "India is my   country";
        //1st way  
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
        System.out.println(noSpaceStr);  
        
        //***************************************
        
     /* //2nd way  
        char[] strArray = str.toCharArray();  
        
        StringBuffer stringBuffer = new StringBuffer();  
        
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) //care \t
            {  
                stringBuffer.append(strArray[i]);  
//                str.append();// String class does not have append()
            }  
        }  
        String noSpaceStr2 = stringBuffer.toString();  
        System.out.println(noSpaceStr2);  
*/        
        //*******************
        
        String s="I am Brahma.	Tab	Tab2	.Tab5	HI";
        
       char[] charr=  s.toCharArray();
       
       for(int i=0;i< charr.length;i++)
       {
    	   if ((charr[i] != ' '&& (charr[i] != '\t'))
    	   {
    		   
    	   }
    	   
       }
       
		
	}

}
