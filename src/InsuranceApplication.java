import java.util.*;

public class InsuranceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeInsurance li = new LifeInsurance();
		
		System.out.println(li.calculatePremium());
		
		LifeInsurance li2 = new LifeInsurance(9844,"Shariq","QTR",60000);
		
		System.out.println(li2.calculatePremium());
		
		//using Wrapper Classes
		long policyNumber = Long.parseLong(args[0]);
		double policyAmount = Double.parseDouble(args[3]);
		
		LifeInsurance li3 = new LifeInsurance(policyNumber,args[1],args[2],policyAmount);
		System.out.println(li3.calculatePremium());
		
		//Using Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Policy Number : ");
		long policyNum = sc.nextLong();
		System.out.println("Enter Policy Holder Name : ");
		String policyHolderName = sc.next();
		System.out.println("Enter Payment Mode : ");
		String paymentMode = sc.next();
		System.out.println("Enter Policy Amount : ");
		double policyAmnt = sc.nextDouble();
		
		LifeInsurance li4 = new LifeInsurance(policyNum,policyHolderName,paymentMode,policyAmnt);
		System.out.println(li4.calculatePremium());
		System.out.println("NetAmount : " + li4.calculatePremium(400000));
		
		sc.close();
	}

}
