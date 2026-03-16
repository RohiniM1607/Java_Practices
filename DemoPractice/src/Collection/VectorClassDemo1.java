package Collection;

import java.util.Vector;

public class VectorClassDemo1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("Size of the vector is "+v.size());
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println("Element in the vector "+v);
		System.out.println("Size of the vector is "+v.size());
	}

}
