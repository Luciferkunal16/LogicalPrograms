package LogicalPrograms;
import java.util.*;
public class _UC3_PrimeNumber {
	void prime(int number) {
		boolean primeNumber=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				
				primeNumber=false;
				break;
				}
			
		}
		if(primeNumber==true) {
			System.out.println("Its is a prime Number");
		}
		else {
			System.out.println("Ti is not a prime Number");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		_UC3_PrimeNumber rv=new _UC3_PrimeNumber();
		System.out.println("Enter a Number ");
		int number=inp.nextInt();
		rv.prime(number);
	}

}
