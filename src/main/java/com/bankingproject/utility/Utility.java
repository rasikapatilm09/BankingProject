package com.bankingproject.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.bankingproject.base.BaseClass;

public class Utility extends BaseClass{
	

	FileInputStream fileInputStream;
	
	public Utility() {
		try {
			this.fileInputStream = new FileInputStream(projectpath+"\\src\\test\\resources\\excel\\bankingweb.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getAllExcelSheetData(String sheetName) throws EncryptedDocumentException, IOException {
		Sheet sh = WorkbookFactory.create(fileInputStream).getSheet(sheetName);
		HashMap<String, Object> hmap = new HashMap<>();
		for(int i=0; i<=sh.getLastRowNum();i++) {
			int cellCount = sh.getRow(i).getLastCellNum();
			for(int j=0; j<cellCount;j++) {
				if(sh.getRow(i).getCell(j).getCellType().toString().equalsIgnoreCase("string")) {
					sh.getRow(i).getCell(j).getStringCellValue();
				}
				else if(sh.getRow(i).getCell(j).getCellType().toString().equalsIgnoreCase("numreic")) {
					sh.getRow(i).getCell(j).getNumericCellValue();
				}
			}
		}
		Set set=hmap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
		
	}
	
	public Object getSingleCellDataFromExcel(int row, int cell,String sheetName) throws EncryptedDocumentException, IOException {
		
		Sheet sh = WorkbookFactory.create(fileInputStream).getSheet(sheetName);
		Object data = "";
		
		if(sh.getRow(row).getCell(cell).getCellType().toString().equalsIgnoreCase("string"))
			data = sh.getRow(row).getCell(cell).getStringCellValue();
		else if(sh.getRow(row).getCell(cell).getCellType().toString().equalsIgnoreCase("numeric"))
			data = sh.getRow(row).getCell(cell).getNumericCellValue();
		return data;
	}

}

