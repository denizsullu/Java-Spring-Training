package workingWithFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//	createFile("deniz");
//	getFileInfo("deniz");
		readFile("deniz");
		writeFile("deniz");
		readFile("deniz");

	}
	public static void createFile(String path) {
		File file = new File("C:\\campspring\\files\\"+path+".txt");
		try {
			if(file.createNewFile()) {
				System.out.println("Dosya oluşturuldu");
			}
			else {
				System.out.println("Dosya zaten var");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getFileInfo(String path) {
		File file = new File("C:\\campspring\\files\\"+path+".txt");
		if(file.exists()) {
			System.out.println("Dosya adı :"+ file.getName());
			System.out.println("Dosya yoly :"+ file.getAbsolutePath());
			System.out.println("Dosya yazılabilir mi :"+ file.canWrite());
			System.out.println("Dosya okunabilir mi :"+ file.canWrite());
			System.out.println("Dosyanın büyüklüğü :"+ file.length());
		}
	}
	public static void readFile(String path) {
		File file = new File("C:\\campspring\\files\\"+path+".txt");
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void writeFile(String path) {
		try {
		
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\campspring\\files\\"+path+".txt",true));
			writer.newLine();
			writer.write("denizce");
			System.out.println("dosyaya yazıldı");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
