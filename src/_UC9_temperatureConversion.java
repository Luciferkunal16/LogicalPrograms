package LogicalPrograms;
import java.util.*;
public class _UC9_temperatureConversion {
	static float toFar(float cel) {
		return (cel*9/5)+32;
	}
    static float toCel(float far) {
		return (far-32)*5/9;
	}
public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	System.out.println("Welcome to Temperature Conversion Program:-");
	System.out.println("1) Farhenheit to Celsius");
	System.out.println("2) Celsius to Farhenhrit " );
	System.out.println("Enter your Choice....");
	int choice =inp.nextInt();
	if(choice ==1) {
		System.out.println("Enter The value in Farhenheit:");
		float far=inp.nextFloat();
		System.out.println("Temperature in Celsius is "+toCel(far)+" C");
	}
	else if(choice ==2) {
		System.out.println("Enter The value in Celcius:");
		float cel=inp.nextFloat();
		System.out.println("Temperature in Celsius is "+toFar(cel)+" F");
	}
	
}
}
