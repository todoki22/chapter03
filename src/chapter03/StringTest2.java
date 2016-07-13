package chapter03;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1.toUpperCase();
		String s3 = s2.concat( "??" );
		String s4 = "!".concat( s2 ).concat( "@" );
		
//		String s4_1 = "!";
//		String s4_2 = s4_1.concat( s2 );
//		String s4 = s4_2.concat( "@" );
		
		
		System.out.println( s1 );
		System.out.println( s2 );
		System.out.println( s3 );
		System.out.println( s4 );
		

	}

}
