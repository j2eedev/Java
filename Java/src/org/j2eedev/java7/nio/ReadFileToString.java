package org.j2eedev.java7.nio;
import static java.lang.System.out;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * 
 * @author Umashankar
 * http://j2eedev.org
 */
public class ReadFileToString {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//readAllBytes -Files.readAllBytes  and get - Paths.get are static imports
		out.println(new String(readAllBytes(get("websites.txt"))));
		
		Path path=Paths.get("websites.txt");
		byte[] contents=Files.readAllBytes(path);
		String fileContent =new String(contents);
		out.println(fileContent);
	}

}
