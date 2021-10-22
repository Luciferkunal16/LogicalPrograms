package LogicalPrograms;

import java.util.Scanner;

public class _UC_VendingMachine {
	int thousand=0;
	int hundred=0;
	int fiveHundred=0;
	int fifty=0;
	int ten=0;
	int five=0;
	int two=0;
	int one=0;
	int totalNotes=0;
	
	void vendingMachine(int change) {
		if(change>=1000) {
			change=change-1000;
			thousand++;
		}
		else if(change>=500 && change <1000) {
			change=change-500;

			fiveHundred++;
			
		}
		else if(change>=100 && change<500) {
			change=change-100;

			hundred++;
			
		}
		else if(change>=50 && change<100) {
			change=change-50;

			fifty++;
			
		}
		else if(change>=10 && change<50) {
			change=change-10;
			
			ten++;
			}
		else if (change>=5 && change<10) {
			change=change-10;
			
			five++;
		}
		else if(change>=2 && change<5 ) {
			change=change-2;
			two++;
			
		}
		else if(change>=1 && change<2) {
			change=change-1;
			one++;
		}
		if(change>=1) {
			vendingMachine(change);
		}
		
		totalNotes=one+two+five+ten+fifty+hundred+thousand+fiveHundred;
		
	}
	
	public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
	_UC_VendingMachine rv=new _UC_VendingMachine();
	System.out.println("Enter The Aount of Change You want:-");
	int change=inp.nextInt();
	rv.vendingMachine(change);
	System.out.println("Total Notes are "+rv.totalNotes);
	System.out.println("Number of Thoudand Note= "+rv.thousand);
	System.out.println("Number of Five Hundred Note= "+rv.fiveHundred);
	System.out.println("Number of Hundred Note= "+rv.hundred);
	System.out.println("Number of fifty Note= "+rv.fifty);
	System.out.println("Number of Ten Note= "+rv.ten);
	System.out.println("Number of Five Note= "+rv.five);
	System.out.println("Number of Two Note= "+rv.two);
	System.out.println("N1umber of one Note= "+rv.one);
	
	}
}
