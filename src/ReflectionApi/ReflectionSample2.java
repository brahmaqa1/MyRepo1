package ReflectionApi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionSample2 {

		public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
		{
			String x="SampleTest2";
			Method method=ReflectionSample2.class.getMethod(x, String.class);
			method.invoke(method, "Hello");
			System.out.println("ends here");

	}

		public static void SampleTest2(String x)
		{
		  System.out.println("in SampleTest2() x="+x);	
		}
		
}
