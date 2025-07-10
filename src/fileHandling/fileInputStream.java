package fileHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;


public class fileInputStream {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\\\Users\\\\naniv\\\\Downloads\\\\Documents\\\\resume.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileInputStream fis=new FileInputStream(f);
		int readfile;
		while ((readfile=fis.read())!=-1) {
		System.out.print((char)readfile );
		}
		fis.close();		
	}

}
