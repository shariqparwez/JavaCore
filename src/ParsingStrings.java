
public class ParsingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ino=Integer.parseInt(args[0]);
		float fno = Float.parseFloat(args[1]);
		double dno = Double.parseDouble(args[2]);
		long lno = Long.parseLong(args[3]);

		 System.out.println("Integer value" +ino );
		 String strIno = Integer.toString(ino);
		 System.out.println("String Value" + strIno);


	}

}
