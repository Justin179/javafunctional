package io;


public class TestDemo {

	public static void main(String[] args){
		String fileName = "D:\\tmp\\testFolder";
		// 建立資料夾
		IOUtil.createFolder(fileName);
		
		// 讀取資料夾目錄	
		String[] files = IOUtil.readFolder(fileName);
		for(String name : files){
			System.out.println(name);
		}
		
		// 刪除檔案
//		IOUtil.deleteFolder(fileName);
		
		System.out.println("end");
		
	}
}
