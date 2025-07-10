package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readfile_method1 {

	public static void main(String[] args) throws IOException {
		 File file = new File("C:\\Users\\naniv\\Downloads\\Documents\\resume.txt");
		 if(!file.exists()) {
			 file.createNewFile();
			 
		 }
		 Scanner sc=new Scanner(file); // we can use instance of fileinputstring inplace of file  when we use file input string close fis;
		 while(sc.hasNextLine()) {
			 System.out.println(sc.nextLine());
		 }
		 
sc.close();
	}

}
