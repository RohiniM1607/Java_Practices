package Collection;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo1 {

	public static void main(String[] args) {
		ArrayList<Double> Arr = new ArrayList<Double>();
		System.out.println("Initial size of array list is "+Arr.size());
		Arr.add(1.0);
		Arr.add(2.0);
		Arr.add(3.0);
		Arr.add(4.0);
		Arr.add(5.0);
		Arr.add(6.0);
		System.out.println("Contents of arraylist using tryadvance");
		Spliterator<Double> sitr = Arr.spliterator();
		while(sitr.tryAdvance((n)->System.out.print(n+" ")));
		System.out.println();
		System.out.println("Contents of arraylist using forEachRemaining");
		sitr = Arr.spliterator();
		sitr.forEachRemaining((n)->System.out.println(n+" "));
		System.out.println();
		System.out.println("Size of array list after insertion is "+Arr.size());
	}

}
