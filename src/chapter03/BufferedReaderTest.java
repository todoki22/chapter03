package chapter03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader( "./src/chapter03/BufferedReaderTest.java" );
			BufferedReader br = new BufferedReader( fr );
			
			String s = null;
			int index = 0;
			while( ( s = br.readLine() ) != null ) {
				String line = String.format( "%3d:%s", ++index, s );
				System.out.println( line );
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		}

	}

}
