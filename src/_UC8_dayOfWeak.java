package LogicalPrograms;
import java.util.*;
public class _UC8_dayOfWeak {
	static int dayOfWeak(int day,int month,int year) {
		int y0=year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month +12*((14-month)/12)-2;
		int d=(day+x+31*m0/12)%7;
		
		return d;
		
	}
	
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
	
		System.out.println("Enter the Month Between 1-12 ");
		int month=inp.nextInt();
		System.out.println("Enter the Day of Month 1-30 ");
		int day=inp.nextInt();
		System.out.println("Enter the Year");
		int year=inp.nextInt();
		System.out.println("WEAK DAY IS "+dayOfWeak(day, month, year));
	}

}
