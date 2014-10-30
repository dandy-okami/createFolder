package com.exo;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestString {
	public static void main(String args[]) throws IOException {
		String org = "/Users/dandy-kun/Documents/test/test.txt";
		String lien = org;
		String search = ".txt";
		String sub = "";
		String result = "";
		int i;

		do { // replace all matching substrings
			i = org.indexOf(search);
			if (i != -1) {
				result = org.substring(0, i);
				result = result + sub;
				result = result + org.substring(i + search.length());
				org = result;
			}
		} while (i != -1);
		File file = new File(org);

		Path source = Paths.get(lien);
		Path out = Paths.get(org+".txt");
		System.out.println(org+"        "+lien+"   "+file.getParent()+"    "+out+"   "+source);
		Files.copy(source,out, StandardCopyOption.REPLACE_EXISTING );
	}

}
