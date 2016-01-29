
public class GoldLoan extends Loan {
	/*public GoldLoan(double lAmnt, String lType){
	super(lAmnt,lType);
}*/

public void interestCalculate(Customers cust){
	loanAmnt = 2000 * cust.goldGram;
	if(cust.goldGram < 100){
		System.out.println("Loan Amount - " + loanAmnt);
		System.out.println("Interest Rate is 10% per annum");
	}
	else{
		System.out.println("Loan Amount - " + loanAmnt);
		System.out.println("Interest Rate is 11% per annum");
	}
}
}
