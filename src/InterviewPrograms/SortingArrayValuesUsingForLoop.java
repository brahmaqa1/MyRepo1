package InterviewPrograms;

import java.util.Arrays;

public class SortingArrayValuesUsingForLoop {

	public static void main(String[] args) {
		
		int a[]={1,3,4,9,3,7};
		
		for(int val : a)
		{
			System.out.println(val);
		}
		System.out.println("After Sorting");
		Arrays.sort(a);// Return type void 
		
		System.out.println("Before Sorting");
		
		for(int val : a)
		{
			System.out.println(val);
		}
		
		

	}

}
