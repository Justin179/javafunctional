package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOUtil2 {
	
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
	
	public static void readTxtFile(String fileName) {
		FileReader fr = null;
		try {
			fr = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(fr);
		String tmp = null;
		try{
			while((tmp = br.readLine()) != null){
				System.out.println(tmp);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void writeTxtFile(String fileName){
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(String str : list){
				bw.write(str);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
	
	public static void copyPictureFile(File source, File dest){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			
			byte[] buffer = new byte[1024];
			int off = 0;
			int len = 0;
			
			while((len = fis.read(buffer)) != -1){
				fos.write(buffer, off, len);
			}
			fos.flush();
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
