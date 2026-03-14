package Arrays;

public class SingleDimensionalArray4 {

	public static void main(String[] args) {
		String[] custName = new String[5]; ; // create array
		custName[0] = "Aaron"; //assign values
		custName[1] = "Kavin";
		custName[2] = "Jesicca";
		custName[3] = "Rishabh";
		custName[4] = "Vinitha";
		System.out.println("************CUSTOMER DETAIL***********");
		for(String name : custName) {
			System.out.println(name);
		}
	}

}
