package LogicalPrograms;
import java.util.*;
public class _UC11_SquareRoot {
	static void squareRoot(double number) {
		   double epsilon = 1e-15;   
	        double t = number;             

	        
	        while (Math.abs(t - number/t) > epsilon*t) {
	            t = (number/t + t) / 2.0;
	            
	}
	        System.out.println("Square Root of number is "+t);
	}
	public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	System.out.println(" Enter a Non Negative Number ");
	double number=inp.nextDouble();
	squareRoot(number);
	}
}
