package LogicalPrograms;
import java.util.*;
public class _UC2_PerfectNumber {
	void perfectNumber(int number) {
		int divisor=0;
				for(int i=1;i<number;i++) {
					if(number%i==0) {
						divisor=divisor+i;
					
					}
					
				}
				if(divisor==number) {
					System.out.println("Its a Perect Number");
				}
				else {
					System.out.println("Its is Not a Perfect NUmber");
				}
	}
	
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		_UC2_PerfectNumber rv=new _UC2_PerfectNumber();
		System.out.println("Enter the Number ");
		int number=inp.nextInt();
		rv.perfectNumber(number);
		}

}
