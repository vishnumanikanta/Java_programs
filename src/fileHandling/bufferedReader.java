package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class bufferedReader {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\\\Users\\\\naniv\\\\Downloads\\\\Documents\\\\resume.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileReader fr=new FileReader(f);
		FileInputStream fi=new FileInputStream(f);
		InputStreamReader ir=new InputStreamReader(fi);
BufferedReader br =new BufferedReader(ir);// inplace ir we use fr to use filrereader 
String readfile;
//int readfile;
//while((readfile=br.read())!=-1) {
//	System.out.print((char)readfile);
//	}
int count=0;
while((readfile=br.readLine())!=null) {
	System.out.println(readfile);
	count++;
}
System.out.println(count);
ir.close();
fr.close();
br.close();
	}
}

//new mwthod known as fread line to read enter line in the statement in bufferreader 
//we use string for readline method 
// we can use filereader or inpuststream if we use input straeam we must use file inputstream 