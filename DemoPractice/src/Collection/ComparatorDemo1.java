package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mobile1 implements Comparable<Mobile1> {
    private String name;
    private int ram;
    private int price;

    Mobile1(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getRam() {
        return ram;
    }

    int getPrice() {
        return price;
    }

    public int compareTo(Mobile1 o) {
        return this.ram - o.getRam(); // simple
    }
}

class PriceCompare implements Comparator<Mobile> {
    public int compare(Mobile m1, Mobile m2) {
        return m1.getPrice() - m2.getPrice();
    }
}

class NameCompare implements Comparator<Mobile> {
    public int compare(Mobile m1, Mobile m2) {
        return m1.getName().compareTo(m2.getName());
    }
}

public class ComparatorDemo1 {

	public static void main(String[] args) {
		List<Mobile> mobileList = new ArrayList<>();

        mobileList.add(new Mobile("Redmi", 16, 800));
        mobileList.add(new Mobile("Apple", 8, 100));
        mobileList.add(new Mobile("Samsung", 4, 600));

        System.out.println("Sorted by Price");

        Collections.sort(mobileList, new PriceCompare());

        System.out.println("Name\tRam\tPrice");

        for (Mobile mb : mobileList) {
            System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
        }
	}

}
