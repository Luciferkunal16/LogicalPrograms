package LogicalPrograms;
import java.util.*;
public class _UC1_FabonaciiSeries {
	void fabonacii(int number) {
		int number1=0;
		int number2=1;
		int number3;
		System.out.print(" "+number1+ " "+number2);
		for(int i=0;i<number;i++) {
			number3=number1+number2;
			System.out.print(" "+number3);
			number1=number2;
			number2=number3;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		_UC1_FabonaciiSeries rv=new _UC1_FabonaciiSeries();
		System.out.println("Enter the Value of n For Fabonaci Series");
		int number=inp.nextInt();
		rv.fabonacii(number);
		
	}

}
