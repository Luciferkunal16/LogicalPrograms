package LogicalPrograms;

import java.util.Scanner;

public class _UC12_ToBinary {
	static void toBinary(int decimal) {
		int binary[] = new int[40];
		int index=0;
		while(decimal > 0){    
		       binary[index++] = decimal%2;    
		       decimal = decimal/2;    
		     }  
		for(int i=0;i<=index;i++) {
			System.out.print(binary[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a Number i Decimal");
		int decimal=inp.nextInt();
		toBinary(decimal);
	}
}
