package io;

import java.io.File;

public class TestDemo2 {

	public static void main(String[] args) {
		// Test writeTxtFile()
//		String fileName = "/Users/Shared/tmp/write.txt";
//		IOUtil.writeTxtFile(fileName);
		
		// Test copyPictureFile
		String source = "D:\\tmp\\testFolder\\breast.mp4";
		String dest = "D:\\tmp\\breast.mp4";
		
		IOUtil2.copyPictureFile(new File(source), new File(dest));

		System.out.println("end2");
	}

}
