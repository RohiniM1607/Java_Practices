package Collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> Arr = new ArrayList<String>();
		System.out.println("Initial size of array list is "+Arr.size());
		Arr.add("C");
		Arr.add("A");
		Arr.add("E");
		Arr.add("B");
		Arr.add("D");
		Arr.add("F");
		Arr.add(1, "G");
		System.out.println("After inser the size of arraylist is "+Arr.size());
		System.out.println("Contents of ArrayList "+Arr);
		Arr.remove("F");
		Arr.remove(2);
		System.out.print("Contents of ArrayList "+Arr);
		
	}

}
