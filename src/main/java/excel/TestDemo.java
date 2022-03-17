package excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {

	public static void main(String[] args){
		/*
		String source = "D:\\tmp\\testFolder\\breast.mp4";
		String dest = "D:\\tmp\\breast.mp4";
		 */
		// 讀取Excel資料
//		String readFileName = "D:\\tmp\\testFolder\\read.xlsx";
//		try {
//			ExcelUtil.readFile(readFileName);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// 寫入Excel資料
		String writeFileName = "D:\\tmp\\testFolder\\write.xlsx";
		DataHelp dataHelp = new DataHelpImp();
		List<String[]> list = dataHelp.getData();
		try {
			ExcelUtil.writeFile(writeFileName, list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Write Excel End");
	}
}
