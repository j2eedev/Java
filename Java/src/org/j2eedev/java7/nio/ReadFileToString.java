package org.j2eedev.java7.nio;
import static java.lang.System.out;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class ReadFileToString {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//readAllBytes -Files.readAllBytes  and get - Paths.get are static imports
		out.println(new String(readAllBytes(get("websites.txt"))));
	}

}
