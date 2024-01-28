package FileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Stream connectivity
		File f = new File(System.getProperty("user.dir")+"\\src\\FileOperations\\ReadFile.txt");
		FileReader fw = new FileReader(f);
		BufferedReader reader = new BufferedReader(fw);
		
		//read text file
		
//		System.out.println(reader.readLine());
//		System.out.println(reader.readLine());
		
		
		String line = null;
		while((line = reader.readLine())!=null) {
			System.out.println(line);
			
		}
		
		reader.close();

	}

}
