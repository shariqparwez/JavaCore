import java.util.*;
public class LoanApplication2 {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Customer c1 = new Customer("Shariq", 25000, 50);
		Customer c2 = new Customer("Krishna", 40000, 30);
		GoldLoan gl = new GoldLoan();
		gl.interestCalculate(c1);*/
		CustomerLoanList[] custLoanList = new CustomerLoanList[5];
		String cName = "";
		double cSal = 0.0;
		long gGram = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("");
		System.out.println("*****MENU*****");
		System.out.println("1.Calculate Personal Loan Amount");
		System.out.println("2.Calculate Gold Loan Amount");
		System.out.println("3.Print Loan List");
		System.out.print("ENTER YOUR CHOICE : ");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter Customer Name : ");
				cName = sc.next();
				System.out.println("Enter Salary : ");
				cSal = sc.nextDouble();
				Customers cust1 = new Customers(cName,cSal);
				PersonalLoan pl = new PersonalLoan();
				pl.interestCalculate(cust1);
				custLoanList[count] = new CustomerLoanList(cName, "Personal Loan");
				count++;
				break;
			case 2:
				System.out.println("Enter Customer Name : ");
				cName = sc.next();
				System.out.println("Enter Gold Grams : ");
				gGram = sc.nextLong();
				Customers cust2 = new Customers(cName,gGram);
				GoldLoan gl = new GoldLoan();
				gl.interestCalculate(cust2);
				custLoanList[count] = new CustomerLoanList(cName, "Gold Loan");
				count++;
				break;
			case 3 :
				for(CustomerLoanList cust:custLoanList)
				{
					if(cust!=null)
					System.out.println(cust.CustomerName + " " + cust.LoanType);
					else
						break;
				}
				
		}
		
		}
	}

}
