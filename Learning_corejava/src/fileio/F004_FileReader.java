package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F004_FileReader {
	public static void main(String[] args) {
		
		
		FileReader fis = null;
		
		try {
			fis = new FileReader("D://test/home.txt");
			
			int i = fis.read();
			
			while(i!=-1)
			{
				char c = (char) i;
				System.out.print(c);
				i = fis.read();
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
