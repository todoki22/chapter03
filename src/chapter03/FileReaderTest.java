package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader( "test.txt" );
			int data = -1;
			while( (data = fr.read() ) != -1 ) {
				System.out.print( (char)data );
			}
			fr.close();

			System.out.println( "" );

			FileInputStream fis = new FileInputStream( "test.txt" );
			while( (data = fis.read()) != -1 ) {
				System.out.print( (char)data );
			}
			
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
		} catch( IOException e ) {
			e.printStackTrace();
		} 
	}

}
