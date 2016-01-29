
public class LifeInsurance {
	private long policyNumber;
	private String policyHolderName;
	private String paymentMode;
	private double policyAmount;
	
	static{
		System.out.println("Static Block Called");
	}
	{
		System.out.println("Initialization Block Called");
	}
	
	public LifeInsurance() {
		super();
		System.out.println("Constructor Called");
		// TODO Auto-generated constructor stub
	}
	
	public LifeInsurance(long policyNumber, String policyHolderName, String paymentMode, double policyAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.paymentMode = paymentMode;
		this.policyAmount = policyAmount;
	}
	
	

	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public double getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}

	public double calculatePremium(){
		return 0.1*policyAmount;
	}
	
	public double calculatePremium(double policyAmnt){
		double amount = policyAmnt * .10;
		double discount = amount * .05;
		double netAmount = amount - discount;
		return netAmount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.policyNumber + ": " + this.policyHolderName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) return true;
		
		//Cautious
		if(obj==null) return false;
		
		// Checking the type of Object
		if(this.getClass()!=obj.getClass()) return false;
		
		LifeInsurance ins =  (LifeInsurance)obj;
		
		return policyNumber == ins.policyNumber && policyHolderName.equals(ins.policyHolderName);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		long code =  this.policyNumber + 7 * policyNumber;
		return (int)code;
	}
}
