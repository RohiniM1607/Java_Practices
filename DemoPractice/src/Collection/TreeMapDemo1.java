package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		System.out.println("Size of the Treemap is "+tm.size());
		tm.put("John Deo", 4343.43);
		tm.put("Tom Smith", 145.23);
		tm.put("Jane Baker", 1450.78);
		tm.put("Ralph Smith", -18.76);
		System.out.println("Element in the Treemap: "+tm);
		System.out.println("Size of the Treemap is "+tm.size());
		Set<Map.Entry<String, Double>>set = tm.entrySet();
		for(Map.Entry<String, Double>me: set) {
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
	}

}
