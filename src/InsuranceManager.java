
public class InsuranceManager {

	public static void printPremiums(LifeInsurance[] policies){
		for(LifeInsurance ins: policies)
		{
			System.out.println(ins);
			System.out.println("Premium := " + ins.calculatePremium());
		}
		
	}
}
