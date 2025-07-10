package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file_writer {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\\\Users\\\\naniv\\\\Downloads\\\\Documents\\\\resume.txt");
		if(f.exists()) {
			f.delete();
		}
		else {
			f.createNewFile();
		}
		String s="nani";
FileWriter fw = new FileWriter(f);
fw.write(s.toCharArray()); //or we can use simply fw.write("nani") without string and chararrays
fw.close();
	}


}
