
public class PersonalLoan extends Loan {
	/*public PersonalLoan(double lAmnt, String lType){
	super(lAmnt,lType);
}*/

public void interestCalculate(Customers cust){
	loanAmnt = 12 * cust.CustomerSalary;
	if(loanAmnt<50000){
		System.out.println("Loan Amount - " + loanAmnt);
		System.out.println("Interest Rate is 14% per annum");
	}
	else{
		System.out.println("Loan Amount - " + loanAmnt);
		System.out.println("Interest Rate is 13% per annum");
	}
}
}
