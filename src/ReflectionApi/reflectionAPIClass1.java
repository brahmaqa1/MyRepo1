package ReflectionApi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.google.common.reflect.Reflection;

public class reflectionAPIClass1 
{	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		//Note1:  copy java file from folder  to eclipse --??? imp
/*		sampleTest("Ram");// ok
		
		reflectionAPIClass1.sampleTest("Raju");//ok
		
		reflectionAPIClass1 obj=new reflectionAPIClass1();
		obj.sampleTest("sam");//ok
*/
		//2nd way:
	//care: calling methods whose method name  we store  in variable
		
		String x="sampleTest"; //methodname is stored in var  
		//get mthodname from xls file in framework
					// reflectionAPIClass1 curent class name
		Method me=reflectionAPIClass1.class.getMethod(x, String.class);
		me.invoke(me, "Raja Ram"); //ok in sample test.x=Raja Ram
		
		String y="openBrowser";
		Method me2=reflectionAPIClass1.class.getMethod(y, String.class);
		me2.invoke(me, "Firefox");//in openBrowser.Firefox
		
		//if we call the method which is not theere, throws NoSuchMethodException
		/*String z="VerifyOrder";
		Method me3=reflectionAPIClass1.class.getMethod(z, String.class);
		me3.invoke(me3, "Firefox");//Exception in thread "main" java.lang.NoSuchMethodException: ReflectionApi.reflectionAPIClass1.VerifyOrder(java.lang.String)
		*/
		//call mthod no args????/ how to ???????
		
		/*String a="OrderCreate";
		Method me3=reflectionAPIClass1.class.getMethod(a);//getMethod ust accept 2 args but here we gave one
		//Exception in thread "main" java.lang.IllegalArgumentException: object is not an instance of declaring class
		me3.invoke(me3);*/
		
		// supose if we need to give 3 parameters??????????????/ not 
		String a="Login";
		Method me4=reflectionAPIClass1.class.getMethod(a,String.class);
		me4.invoke(me4, "brahma","mercury");
		
		System.out.println("ends here");
	}
	
		public static void sampleTest(String x)
		{
			 System.out.println("in sample test.x="+x);
		}
		
		public static void openBrowser(String x)
		{
			 System.out.println("in openBrowser."+x);
		}
		
		public void OrderCreate()
		{
			System.out.println("in order creation.");
		}
		
		public void Login(String un,String pwd)
		{
			System.out.println("inLogin.");
		}
		
}
