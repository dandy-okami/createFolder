/**
 * 
 */
package com.exo;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author dandy-kun
 *
 */
public class CreateFolder {

	/**
	 * @param args
	 * @param FileSystems.getDefault().getRootDirectories(); 
	 */
	static void rootDirectory(){
		Iterable<Path> directory = FileSystems.getDefault().getRootDirectories();
		for (Path path : directory) {
			System.out.println(path);}
	}
	static void showContent() throws IOException{
		String directory ="/Users/dandy-kun/Documents";
		Path dir = Paths.get(directory);
		File fil = new File(directory);
		File [] tab =fil.listFiles();
		for (File file : tab) {
			System.out.println(file.getName());
		}
	}
	static void creatFolder() throws FileAlreadyExistsException{
		String directory ="/Users/dandy-kun/Documents/test";
		File file = new File(directory);
		file.mkdirs();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CreateFolder.rootDirectory();
		CreateFolder.showContent();
		CreateFolder.creatFolder();
		
		}
	
}
