package com.cgi.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	/**
	 * Converts the given sheet into two dimensional Object array
	 * 
	 * @param filePath  - Excel File Detail
	 * @param sheetname - Sheetname to convert to Object[][]
	 * @return Object[][]
	 * @throws IOException
	 */
	public static Object[][] getSheetIntoTwoDimensionalArray(String filePath, String sheetname) throws IOException {

		FileInputStream file = new FileInputStream(filePath);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet(sheetname);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[rowCount - 1][cellCount];

		DataFormatter format = new DataFormatter();
		for (int r = 1; r < rowCount; r++) {
			for (int c = 0; c < cellCount; c++) {
				data[r - 1][c] = format.formatCellValue(sheet.getRow(r).getCell(c));
			}
		}

		book.close();
		file.close();

		return data;
	}

}
