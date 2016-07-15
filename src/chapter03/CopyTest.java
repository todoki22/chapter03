package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream( "sample.jpg" );
			fos = new FileOutputStream( "sample2.jpg" );
			
			int data = -1;
			while( (data = fis.read()) != -1 ){
				fos.write( data );
			}

		} catch (FileNotFoundException e) {
			System.out.println( "파일을 찾을 수 없습니다.:" + e );
			return;
		} catch (IOException e ) {
			e.printStackTrace();
		} finally {
			// 자원정리(파일닫기)
			try {
				if( fis != null ) {
					fis.close();
				}
			
				if( fos != null ) {
					fos.close();
				}
			} catch( IOException e ) {
				e.printStackTrace();
			}
		}
	}

}
