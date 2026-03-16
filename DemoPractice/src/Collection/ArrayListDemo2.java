package Collection;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> Arr = new ArrayList<Integer>();
		System.out.println("Initial size of Array list is "+Arr.size());
		Arr.add(1);
		Arr.add(2);
		Arr.add(3);
		Arr.add(4);
		System.out.println("After insr the size of array list is "+Arr.size());
		//Arr.remove(2);
		System.out.println("Contents of ArrayList"+Arr);
		Arr.toArray();
		Integer ia[] = new Integer[Arr.size()];
		ia = Arr.toArray(ia);
		int sum = 0;
		
		for(int i : ia)
			sum+=i;
		System.out.println("Sum value is "+sum);
	}

}
