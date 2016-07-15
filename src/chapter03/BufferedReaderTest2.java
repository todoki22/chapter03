package chapter03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream( "ms949_2.txt" );
			InputStreamReader isr = new InputStreamReader( fis, "ms949" );
			BufferedReader br = new BufferedReader( isr );

			String s = null;
			while( ( s = br.readLine() ) != null ) {
				System.out.println( s );
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
