package Collection;

import java.io.*;
import java.util.*;

class Mobile implements Comparable<Mobile>{
	private String name;
	private int ram;
	private int price;
	public Mobile(String name, int ram, int price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getRam() {
		return ram;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int compareTo(Mobile o) {
		if(this.ram>o.getRam()) {
			return 1;
		}
		else
			return -1;
	}
	
	
}

public class ComparableDemo1 {

	public static void main(String[] args) {
		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(new Mobile("RedMe", 16, 800));
		mobileList.add(new Mobile("Apple", 8, 100));
		mobileList.add(new Mobile("Samsung", 4, 600));
		
		Collections.sort(mobileList);
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		for(Mobile mb : mobileList) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
	}

}
