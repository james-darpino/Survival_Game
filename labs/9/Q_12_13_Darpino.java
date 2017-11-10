import java.io.File;
import java.util.Scanner;

public class Q_12_13_Darpino {

	public static void main(String[] args) throws Exception{
		int characters = 0;
		int words = 0;
		int lines = 0;

		if (args.length != 4) {
			System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
			System.exit(1);
		}
		//check if source file exists 
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(2);
		}

		try(
				//create input and output files
				Scanner input = new Scanner(sourceFile);
			

				) {
			while (input.hasNext()) {
				lines++;
				String line = input.nextLine();
				characters += line.length();
				words ++;
			}
		} finally {
			//display 
			System.out.println("File " + sourceFile.getName() + " has");
			System.out.println(characters + " characters");
			System.out.println(words + " words");
			System.out.println(lines + " lines");
			
		}


	
		}
	
			}

	

