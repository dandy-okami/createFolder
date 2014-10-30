package com.exo;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create {
	/**
	 * @param args
	 * @param FileSystems
	 *            .getDefault().getRootDirectories();
	 */
	static void rootDirectory() {
		Iterable<Path> directory = FileSystems.getDefault()
				.getRootDirectories();
		for (Path path : directory) {
			System.out.println("disque local: " + path);
		}
	}

	static void showContent() throws IOException {
		String directory = "/Users/dandy-kun/Documents";
		Path dir = Paths.get(directory);
		File fil = new File(directory);
		File[] tab = fil.listFiles();
		for (File file : tab) {
			System.out.println("+----" + file.getName());
		}
	}

	static void creatFolder() throws IOException {
		String directory = "/Users/dandy-kun/Documents/test";
		File folder = new File(directory);
		if (folder.exists()==false) {
			folder.mkdir();
			System.out.println("Dossier créer avec succes");
		}else{
			System.out.println("Dossier déja existant");
		}
	
	}

	static void createFile() throws IOException {
		String fichier = ("/Users/dandy-kun/Documents/test/test.txt");
		File file = new File(fichier);
		if (file.createNewFile()) {
			System.out.println("Fichier créer avec succes");
		} else {
			System.out.println("fichier déja existant");
		}
	}

	static String getFileExtensionName() {
		String fichier = ("C:\\Users\\admin\\Documents\\test\\test.txt");
		File file = new File(fichier);
		if (file.getName().indexOf(".") == -1) {
			return "";
		} else {
			return file.getName().substring(file.getName().length() - 3,
					file.getName().length());
		}
	}

	public static void main(String[] args) throws IOException {
		Create.rootDirectory();
		Create.showContent();
		Create.creatFolder();
		Create.createFile();
		
	}

}