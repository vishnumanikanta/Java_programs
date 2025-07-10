package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputStream {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\\\Users\\\\naniv\\\\Downloads\\\\Documents\\\\resume.txt");
		if(f.exists()) {
			f.delete();
		}
		else {
			f.createNewFile();
		}
		FileOutputStream fos =new FileOutputStream(f);
		String s ="nani";
		for(char c:s.toCharArray()) {
			fos.write(c);
		}
		

	}
	

}
