package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferWriter {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\naniv\\Downloads\\Documents\\resume.txt");

		// Reading existing content
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line;
		while ((line = br.readLine()) != null) {
		    System.out.println(line);
		}
		br.close();

		// Writing new content (append mode)
		BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
		bw.write("nani8709cd\n"); // Adds this line to the end
		bw.close();

}
}