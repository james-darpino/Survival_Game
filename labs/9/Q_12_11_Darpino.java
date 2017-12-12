import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Q_12_11_Darpino {

	public static void main(String[] args) throws Exception{

		// JA: This was supposed to read the file name in the command line
		File file = new File("C:\\Users\\pc\\Documents\\GitHub\\cmpt220Darpino\\cmpt220Darpino\\labs\\9\\myFile.txt");
		File temp = File.createTempFile("file", ".txt", file.getParentFile());


		String lineToRemove = "Dad";
		String currentLine;

		BufferedReader reader = new BufferedReader(new FileReader(file));
		BufferedWriter writer = new BufferedWriter(new FileWriter(temp));

		while((currentLine = reader.readLine()) != null) {

			//trim new line when comparing 
			String trimmedLine = currentLine.trim();
			if(trimmedLine.equals(lineToRemove)) continue;
			writer.write(currentLine + System.getProperty("line.separator"));
		}
		//close file
		writer.close(); 
		reader.close(); 
		//rename temp file to file
		temp.renameTo(file);
	}
}