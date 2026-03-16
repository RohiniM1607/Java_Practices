package Collection;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		System.out.println("Size of the stack is "+stk.size());
		stk.push("A");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		System.out.println("Elements in the stack "+stk);
		System.out.println("Size of the stack is "+stk.size());
		stk.pop();
		System.out.println("Elements in the stack after remove "+stk);
		System.out.println("Size of the stack after the removal is "+stk.size());
	}

}
