package LogicalPrograms;
import java.util.*;
public class _UC4_ReverseOfNumber {
	int reverseIs(int number) {
		int rem;
		int reverseNumber=0;
		while(number!=0) {
			rem=number%10;
			reverseNumber=(reverseNumber*10)+rem;
			number=number/10;
		}
		return reverseNumber;
		} 
	
	
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		_UC4_ReverseOfNumber rv=new _UC4_ReverseOfNumber();
		System.out.println("Enter a Number-");
		int number=inp.nextInt();
		System.out.println("Reverse Number is "+rv.reverseIs(number));
	}
}
