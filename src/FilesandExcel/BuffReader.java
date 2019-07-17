package FilesandExcel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("D:\\qtp practise\\TestData\\config.txt");
		//BufferedReader br=new BufferedReader();//error it should need any i/p stream class refe
		BufferedReader br=new BufferedReader(fr);
		
		
		/*String l1=br.readLine();//
		String l2=br.readLine();
		String l3=br.readLine();//
		
		System.out.println("l1="+l1);//l1=os=XP
		System.out.println("l2="+l2);//l2=version=IE7
		System.out.println("l3="+l3);//null
*/	
		
		
		//Read all		
		//while (br.readLine()!=-1)//error ************
		//String s1;//?????????
		while (br.readLine()!= null)//Care
			//while (s1=br.readLine()!= null)
		{
			String s=br.readLine();
			System.out.println("s="+s);//s=version=IE7???????????????? why o/p??????????/
						
			//System.out.println("s1="+s1);//?????????error 
		}
		
		//br.read()    *******************************
		
		/*int i=br.read();//care************??????????? br.read()returns int val
		System.out.println("i="+i);
		char c=(char)i;
		System.out.println("c="+c);//R ???????????????????
			//System.out.println(asc(0));//?????????????
*/
	}
}
