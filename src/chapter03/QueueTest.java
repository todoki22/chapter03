package chapter03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		queue.offer( "둘리" );
		queue.offer( "마이콜" );
		System.out.println( queue.size() );
		
		System.out.println( queue.peek() );

		queue.offer( "도우넛" );
		
		System.out.println( queue.poll() );
		System.out.println( queue.size() );
		
		while( queue.isEmpty() == false ) {
			System.out.println( queue.poll() );
		}
		
	}

}
