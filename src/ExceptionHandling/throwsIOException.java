package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sample
{
	private String name;
	void accept() throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter name=");
		//name=br.readLine();//throws ioexception
		name=br.readLine();
	}
	
	void display()
	{
		System.out.println("name="+name);
	}
}

public class throwsIOException {
	
	public static void main(String[] args) throws IOException
	{
		sample sobj=new sample();
		sobj.accept();//throws IOException ...after in main
		sobj.display();
	}//main
}
