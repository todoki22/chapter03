package chapter03;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer( 10 );
		Character c = new Character( 'A' );
		Double d = new Double( 3.14 );
		
		Integer i2 = new Integer( "10" );
		
		System.out.println( i + "," + c + "," + d + "," + i2 );
		
		// static 메소드
		char ch = Character.toLowerCase( 'A' );
		System.out.println( ch );
		
		char ch2 = '9';
		if( Character.isDigit( ch2 ) ) {
			int i3 = Character.getNumericValue( ch2 );
			System.out.println( i3 );
		}
		
		int i4 = Integer.parseInt( "12345" );
		int i5 = Integer.parseInt( "-12345" );
		int i6 = Integer.parseInt( "10", 16 );
		System.out.println( i4 + "," + i5 + "," + i6 );
		
		String s2 = Integer.toBinaryString( 10 );
		System.out.println( s2 );
		System.out.println( Integer.bitCount( 10 ) );
		System.out.println( Double.parseDouble( "3.14" ) );
		
		Integer i3 = 10;
		Integer j3 = 10;
		System.out.println( i3 == j3 );

	}

}
