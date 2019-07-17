package arrayFirst1;

public class array1 {

	public static void main(String[] args) {

		String name="Brahma";
		String city="Hyder";
		String code="001";
		String State="AP";
		String country="IND";
		
		String a[]=new String[5];//declare array with name "a" of type string 
		a[0]=name;
		a[1]=city;
		a[2]=code;
		a[3]=State;
		a[4]=country;
		
		//a[5]="error";// error index out of bounds 
		
		System.out.println(a[0]);//Brahma
		System.out.println(a[1]);//Hyder
		//
		//for(int i=1;i<=5;i++)// error 
		//for(int i=1;i< 5;i++)  //ok
	   for(int i=1;i<=4;i++)//
		{
			System.out.println(a[i]);//
		}
	}

}
