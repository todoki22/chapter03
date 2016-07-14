package chapter03;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push( "둘리" );
		stack.push( "도우넛" );
		System.out.println( stack.peek() );
		stack.push( "마이콜" );
		System.out.println( stack.pop() );
		stack.push( "고길동" );
		
		
		while( stack.isEmpty() == false ) {
			String s = stack.pop();
			System.out.println( s );
		}

	}

}
