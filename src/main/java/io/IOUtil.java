package io;

import java.io.File;

public class IOUtil {
	
	public static void createFolder(String fileName){
		File file = new File(fileName);
		file.mkdirs();
	}
	
	public static String[] readFolder(String fileName){
		File file = new File(fileName);
		return file.list();
	}
	
	public static void deleteFolder(String fileName){
		File file = new File(fileName);
		file.delete();
	}
	
	public static void readTxtFile(String fileName){
		
	}
	
	public static void writeTxtFile(String fileName){
		
	}
	
	public static void copyPictureFile(String fileName){
		
	}
}
