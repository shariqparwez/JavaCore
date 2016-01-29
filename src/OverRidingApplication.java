
public class OverRidingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeInsurance ins1 = new LifeInsurance(101,"Rajesh","QTR",9000);
		//System.out.println(ins);
		LifeInsurance ins2 = new LifeInsurance(101,"Rajesh","QTR",9000);
		//System.out.println(ins.toString());
		//LifeInsurance ins2 = ins1;
		LifeInsurance ins3=ins1;
		
		System.out.println(ins1.equals(ins2));
		System.out.println(ins1==ins2);
		
		System.out.println("Exact Value" + ins1.equals(ins2));
		System.out.println("Identity" + ins1.equals(ins3));
		
		
	}

}
