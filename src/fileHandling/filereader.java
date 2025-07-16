package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class filereader {

	public static void main(String[] args) throws IOException  {
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


//createnewfile
//exits
//delte


//read file   scanner, file reader, inputfilestream , bufferd reader


// write file method 


// error io exception either it can be solved by try catcdh r we solved by throws io exception