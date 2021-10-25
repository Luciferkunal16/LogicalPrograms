package LogicalPrograms;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Scanner;

public class _UC13_SwapNibbles {
	static void swapNibbles(int decimal) {
		   int swapedNumber=(decimal & 0x0F)<<4 | (decimal & 0xF0)>>4 ;
			System.out.println( swapedNumber);
			multipleofTwo(swapedNumber);
			
		}
	static void multipleofTwo(int swapNumber)
	{
		if(swapNumber%2==0) {
			System.out.println("Number is multiple of 2");
		}
		else {
			System.out.println("Number is  not multiple of two");
		}

	}
	        

	

	

	
public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter a Decimal Number:-");
	int decimal=inp.nextInt();
	

	
	swapNibbles(decimal);
}
}
