package a07_fileio;

import java.io.File;
import java.io.IOException;

public class F005_FileDemo {
	public static void main(String[] args) {
		
		
		
		File file = new File("D://test//data");
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		//file.mkdir();
		
		
//		if(file.exists())
//		{
//			System.out.println("File available !!!");
//			file.delete();
//			System.out.println("File deleted...");
//			
//			
//		}else
//		{
//			System.out.println("File does not exist !!!");
//			try {
//				file.createNewFile();
//				System.out.println("File created...");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//			
//		}
		
		
		
		
		
	}
}
