package chapter03;

public class LangCalssTest {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(50, 100);
		Point p3 = p1;
		
		// Object 의 기본 메서드 테스트
		System.out.println( p1.getClass().getName() );
		System.out.println( p1.hashCode() );
		System.out.println( p1.toString() ); 
		System.out.println( p1 );
		
		// == -> 객체인 경우에는 동일한 객체 여부(동일성) 
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		
		//equals -> 객체의 내용비교(동등성)
		Point p4 = new Point( 10, 20 );
		System.out.println( p1 == p4 );
		System.out.println( p1.equals( p4 ) );
		
		String s1 = new String( "hello" );
		String s2 = new String( "hello" );
		System.out.println( s1 == s2 );
		System.out.println( s1.equals( s2 ) );
		
		
		//
		System.out.println( System.identityHashCode( p1 ) );
		
	}

}
