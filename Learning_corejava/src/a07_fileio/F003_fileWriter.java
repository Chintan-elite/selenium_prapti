package a07_fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_fileWriter {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D://test//home.txt");
			String data = "hello, this is filewriter practice";
			fw.write(data);
			fw.flush();
			System.out.println("Data written...");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
