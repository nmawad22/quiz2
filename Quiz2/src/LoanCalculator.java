//import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;
public class LoanCalculator {
	//public static double pmt(double r, double n, double p, double f, boolean t) {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		//variables
		double tuitionCost, percentIncrease, repaymentAPR, totalTuitionCost;
		int term, payments;
		double loanBalance = 0;
		
		System.out.println("Please enter your first year tuition cost:");
		tuitionCost = console.nextDouble();
		loanBalance += tuitionCost;
		for (int i = 0; i < 3; i++) {
			System.out.println("What is the percentage increase for next year?(as % value) ");
			percentIncrease = console.nextDouble() / 100.0;
			tuitionCost += tuitionCost * percentIncrease;
			loanBalance += tuitionCost;
			
		}
		System.out.println("What is the repayment APR?(as % value) ");
		repaymentAPR = console.nextDouble() / 100.0;
		
		System.out.println("How many years do you plan to take to repay your loan?");
		term = console.nextInt();
		payments = term*12;
		
		double pmt =	FinanceLib.pmt(repaymentAPR, payments, loanBalance, 0.0, true);
		
		System.out.printf("Your tuition cost is: $%8.2f \n Your monthly payment is: $%8.2f " , loanBalance,pmt*-1);
//Future Value is 0 so FinanceLib is returning a negative number, so I multiplied by -1 to fix this  ^
	}
}

