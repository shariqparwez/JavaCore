
public class Customers {
	public String CustomerName;
	public double CustomerSalary;
	public long goldGram;
	
	public Customers(String cName, double cSal){
		CustomerName = cName;
		CustomerSalary = cSal;
	}
	public Customers(String cName, long gGram){
		CustomerName = cName;
		goldGram = gGram;
	}
}
