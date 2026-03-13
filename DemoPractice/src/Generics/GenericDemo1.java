package Generics;

class Demo<T>{
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}

public class GenericDemo1 {

	public static void main(String[] args) {
		Demo<Integer>iObj = new Demo<Integer>();
		iObj.set(25);
		System.out.println(iObj.get());
		
		Demo<String> sObj = new Demo<String>();
		sObj.set("Demo");
		System.out.println(sObj.get());
	}

}
