/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi {
	private Workbook wb = null;
	private int currentSheet = -1;

	public static boolean testCreateExcel(File file) {
		try {
			new XSSFWorkbook(new FileInputStream(file));
			return true;
		} catch (Exception e) {
		}
		try {
			new HSSFWorkbook(new FileInputStream(file));
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	private Workbook createWorkBook(File file) {
		try {
			return new XSSFWorkbook(new FileInputStream(file));
		} catch (Exception e) {
		}
		try {
			return new HSSFWorkbook(new FileInputStream(file));
		} catch (Exception e) {
		}
		return null;
	}

	private Workbook createWorkBook() {
		return new XSSFWorkbook();
	}

	public void createExcel() {
		createExcel(null);
	}

	public void createExcel(File file) {
		if (file == null) {
			wb = createWorkBook();
			wb.createSheet();
		} else {
			wb = createWorkBook(file);
		}
		currentSheet = 0;
	}

	public InputStream toInputStream() throws IOException {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		wb.write(os);
		return new ByteArrayInputStream(os.toByteArray());
	}

	public String[][] toStringArray() {
		String[][] array = new String[getBottom()][getRight()];
		for (int i = 0; i < getBottom(); i++) {
			for (int j = 0; j < getRight(); j++) {
				Row row = wb.getSheetAt(currentSheet).getRow(i);
				if (row == null) {
					array[i][j] = "";
					continue;
				}
				Cell cell = row.getCell(j);
				if (cell == null) {
					array[i][j] = "";
					continue;
				}
				array[i][j] = getStringValue(cell);
			}
		}
		return array;
	}

	public void fromStringArray(String[][] data) {
		if (data == null)
			return;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				Pattern p = Pattern.compile("^[0-9]*$");
				Matcher m = p.matcher(data[i][j]);
				boolean b = m.matches();
				if (b)
					getCell(i, j).setCellValue(Double.parseDouble(data[i][j]));
				else
					getCell(i, j).setCellValue(data[i][j]);
			}
		}
	}

	public void deleteRow(int i) {
		Sheet sheet = wb.getSheetAt(currentSheet);
		Row row = sheet.getRow(i);
		sheet.removeRow(row);
	}

	public void deleteCol(int i) {
	}

	private Row getRow(int rownum) {
		Sheet sheet = wb.getSheetAt(currentSheet);
		if (sheet.getRow(rownum) == null)
			sheet.createRow(rownum);
		return sheet.getRow(rownum);
	}

	private Cell getCell(int rownum, int colnum) {
		Row row = getRow(rownum);
		if (row.getCell(colnum) == null)
			row.createCell(colnum);
		return row.getCell(colnum);
	}

	private String getStringValue(Cell cell) {
		if (null == cell) {
			return "";
		}
		String strCell = "";
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_STRING:
			strCell = cell.getStringCellValue();
			break;
		case Cell.CELL_TYPE_NUMERIC:
			double d = cell.getNumericCellValue();
			long l = (long) d;
			if (d == l)
				strCell = String.valueOf(l);
			else
				strCell = String.valueOf(d);
			break;
		case Cell.CELL_TYPE_BOOLEAN:
			strCell = String.valueOf(cell.getBooleanCellValue());
			break;
		case Cell.CELL_TYPE_FORMULA:
			strCell = cell.getCellFormula();
			break;
		case Cell.CELL_TYPE_ERROR:
			strCell = String.valueOf(cell.getErrorCellValue());
			break;
		default:
			strCell = "";
			break;
		}
		return strCell.trim();
	}

	public int getTop() {
		return wb.getSheetAt(currentSheet).getFirstRowNum();
	}

	public int getBottom() {
		Sheet sheet = wb.getSheetAt(currentSheet);
		if (sheet.getPhysicalNumberOfRows() == 0)
			return 0;
		else
			return wb.getSheetAt(currentSheet).getLastRowNum() + 1;
	}

	public int getLeft() {
		Sheet sheet = wb.getSheetAt(currentSheet);
		if (sheet.getPhysicalNumberOfRows() == 0)
			return 0;
		int i = sheet.getRow(sheet.getFirstRowNum()).getFirstCellNum();
		for (Row row : sheet) {
			i = i < row.getFirstCellNum() ? i : row.getFirstCellNum();
		}
		return i;
	}

	public int getRight() {
		Sheet sheet = wb.getSheetAt(currentSheet);
		if (sheet.getPhysicalNumberOfRows() == 0)
			return 0;
		int i = sheet.getRow(sheet.getFirstRowNum()).getLastCellNum();
		for (Row row : sheet) {
			i = i > row.getFirstCellNum() ? i : row.getLastCellNum();
		}
		return i;
	}

	public boolean isEmpty() {
		if (currentSheet == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void fromStringArray(List list, String[] title) {
		setValue(0, 0, "编号");
		for (int j = 0; j < title.length; j++) {
			setValue(0, j + 1, title[j]);
		}
		for (int i = 0; i < list.size(); i++) {
			Object[] os = (Object[]) list.get(i);
			setValue(i + 1, 0, String.valueOf(i + 1));
			for (int j = 0; j < os.length; j++) {
				setValue(i + 1, j + 1, os[j].toString());
			}
		}
	}

	private void setValue(int i, int j, String value) {
		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher m = p.matcher(value);
		boolean b = m.matches();
		if (b)
			getCell(i, j).setCellValue(Double.parseDouble(value));
		else
			getCell(i, j).setCellValue(value);
	}
}
