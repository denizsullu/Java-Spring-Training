package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(new  FileReader("C:\\campspring\\readingFileDemo\\src\\readingFileDemo\\sayilar.txt"));
			String line = null;
			while((line = reader.readLine())!=null){
				total += Integer.valueOf(line);
			}
			System.out.println(total);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}

	}

}
