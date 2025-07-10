package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class filereader {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\\\Users\\\\naniv\\\\Downloads\\\\Documents\\\\resume.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileReader fr=new FileReader(f);
		int readfile;
		int count=-1;//counting characters
		
		
		while ((readfile=fr.read())!=-1) {
		System.out.print((char)readfile);
		count++;
		}
		System.out.println(count);
		fr.close();
	}

}
