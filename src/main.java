import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Scanner fileIn;
		PrintWriter fileOut1;
		String filenameIn;
		String filenameOut1;
		int dotIndex;
		String line = null;
		
		System.out.println("filename");
		filenameIn = scanner.nextLine();
				
		try {
			
			fileIn = new Scanner(new FileReader(filenameIn));
			dotIndex = filenameIn.lastIndexOf(".");
			if(dotIndex == -1) {
				filenameOut1 = filenameIn +".html";
			}
			else {
				filenameOut1=filenameIn.substring(0,dotIndex)+".html";
			}
			fileOut1 = new PrintWriter(filenameOut1);
			
			try {
				line = fileIn.nextLine();			
			}
		
		
		catch(NoSuchElementException e) {
			System.out.println("file not found");
		}
		if(line==null) {
			System.out.println("this file is umpty :(");
		
		}
		else {
	 fileOut1.println("<html>");
	 fileOut1.println("<head>");
	 fileOut1.println("</head>");
	 fileOut1.println("<body>");
	 fileOut1.println(line);
	 
	 while(fileIn.hasNextLine()) {
		 
		 fileOut1.println("<br>");
		 line = fileIn.nextLine();
		 
		 if(line.isEmpty()) {
			 fileOut1.println("<br>");
		 }
		 else {
			 fileOut1.println(line);
		 }
		 
	 }
	 fileOut1.println("</body>");
	 fileOut1.println("</html>");
	 
	 System.out.println("HTML is done");
		}
	    fileIn.close();
		fileOut1.close();
	}
	catch(FileNotFoundException e) {
		System.out.println("File not found");
	}
	
}
}

		 
	
	
		
		
