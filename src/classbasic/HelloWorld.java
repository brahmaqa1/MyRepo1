package classbasic;
public class HelloWorld {

		public String say (String name)
		 {
		return String.format("Hello, %s!", name);
		}

		public static void main (String[] args) 
		{
		String msg =new HelloWorld().say("Johnny, B. Good");//create obj of HelloWorld	//call say method and returns strng 
		System.out.println(msg);
		
		}
}