package LogicalPrograms;

import java.util.Scanner;

public class _UC13_SwapNibbles {
	static void swapNibbles(int decimal) {
		 System.out.println(( decimal & 0x0F) << 4 | (decimal&0xF0)>>4);
		
	}
	
public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter a Decimal Number:-");
	int decimal=inp.nextInt();
	swapNibbles(decimal);
}
}
