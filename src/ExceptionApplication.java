import com.training.myexceptions.RangeCheckException;

public class ExceptionApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Customer cust = new Customer("Rajesh",25000,899);
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Inside Finally");
			
		}
		System.out.println("Bye");
		
	}

}
