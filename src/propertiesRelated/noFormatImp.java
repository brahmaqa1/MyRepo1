package propertiesRelated;

import java.text.NumberFormat;

public class noFormatImp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat nf=NumberFormat.getInstance();
		
		nf.setMaximumFractionDigits(3);
		System.out.println(nf.format(123.4));// 123.4
		
		System.out.println(nf.format(123.4567));//123.457
		
		nf.setMinimumFractionDigits(3);
		System.out.println(nf.format(123.4));//  123.400
		System.out.println(nf.format(123.4567));// 123.457
		
		nf.setMaximumIntegerDigits(3);
		System.out.println(nf.format(1.234));// 1.234		
		System.out.println(nf.format(123456.789));
		
		nf.setMinimumIntegerDigits(3);
		System.out.println(nf.format(1.234));
		System.out.println(nf.format(123456.789));
		/*123.4
		123.457
		123.400
		123.457
		1.234
		456.789
		001.234
		456.789*/


	}

}
