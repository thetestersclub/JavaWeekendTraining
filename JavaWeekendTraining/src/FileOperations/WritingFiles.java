package FileOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//Stream connectivity
		File f = new File("C:\\WeekEndTraining\\writetest.csv");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter writer = new BufferedWriter(fw);
		
		//writing in the file
		writer.write("Hello");
		writer.newLine();
		writer.write("Weekend Batch");
		writer.newLine();
		//writer.write("on saturday and sunday");
		writer.write("on saturday and sunday3\n");
		writer.newLine();
		writer.write("Appended");
		
		//closing stream
		writer.close();
		
		System.out.println("File Created");
		
		

	}

}
