package org.viveklothe.excel;

import org.viveklothe.excel.model.WorkbookData;

import java.io.IOException;


/**
 * created by VivekLothe on 28/07/2019
 */

public interface ExcelWorkbook {

   WorkbookData getWorkbookDataExcel(String fileName) throws IOException;

}
