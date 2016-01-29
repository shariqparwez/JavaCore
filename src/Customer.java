import com.training.myexceptions.RangeCheckException;

public class Customer {
	private String custName;
	private double salary;
	private long handPhone;
	//private double loanAmount;
	//private long goldGrams;
	
	//Declare Rule
	public Customer(String custName, double salary, long handPhone) throws RangeCheckException {
		super();
		this.custName = custName;
		this.salary = salary;
		if(handPhone<9999999999L && handPhone>1111111111L){
			throw new RangeCheckException(handPhone);
		}
		else{
		this.handPhone = handPhone;
		}
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public long getHandPhone(){
		return handPhone;
	}
	
	public void setHandPhone(long handPhone) {
		if(handPhone<9999999999L && handPhone>1111111111L){
		try {
			throw new RangeCheckException(handPhone);
		} catch (RangeCheckException e){
			System.out.println(e.getMessage());
		}
		}
		else
		{
			this.handPhone = handPhone;
		}
		
	}

	
}
