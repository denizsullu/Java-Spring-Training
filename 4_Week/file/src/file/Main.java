package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		File file = new File("C:\\campspring\\files\\deniz.txt");
//		File file2 = new File("C:\\campspring\\files\\zeynep.txt");
//		if(file.renameTo(file2)) {
//			System.out.println("Dosya başarıyla oluşturuldu");
//		}
//		else {
//			System.out.println("Dosya zaten var");
//		}
		  try {
	            FileReader reader = new FileReader("C:\\campspring\\files\\zeynep1.txt");
	            int character;
	            
	            while ((character = reader.read()) != -1) {
	                System.out.print((char) character);
	            }
	            reader.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


