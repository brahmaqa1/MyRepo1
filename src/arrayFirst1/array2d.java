package arrayFirst1;

public class array2d {

	public static void main(String[] args) {
		System.out.println("*************TWO DIM ARRAYS****************");
		   //[ROW][COL]
//String s[][] = new String[2][4]; //ok
		
//or  place braces before array name or after array anme
String [][] s = new String[2][4]; //ok
// 1st row
s[0][0]="00";
s[0][1]="01";
s[0][2]="02";
s[0][3]="03";

// 2nd row
s[1][0]="10";
s[1][1]="11";
s[1][2]="12";
s[1][3]="13";

System.out.println("Rows are --- "+s.length);// 2  row size
//***********Care
System.out.println("cols are --  "+s[0].length);//Care :::   col size  

System.out.println(s[0][0]);

int rno=s.length;  //2
int colno=s[0].length;//4 **********Care:

		for(int r=0;r<rno;r++)
		{
			for(int c=0;c<colno;c++)
			{
				System.out.print(s[r][c]+" ");
			}
			System.out.println();
		}

	}

}
