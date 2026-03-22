package Generics;

class Demo2 {
    public <T> T getData(T value) {
        return value;
    }
}

public class GenericMethod2 {

	public static void main(String[] args) {
		 Demo2 d = new Demo2();

	        String a = d.getData("Java");
	        Integer b = d.getData(25);

	        System.out.println(a);
	        System.out.println(b);
	}

}
