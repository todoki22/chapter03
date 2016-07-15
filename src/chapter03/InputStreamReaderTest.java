package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream( "ms949.txt" );
			InputStreamReader isr = new InputStreamReader( fis, "ms949" );
			
			int data = -1;
			while( ( data = isr.read() ) != -1 ) {
				System.out.print( (char)data );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
