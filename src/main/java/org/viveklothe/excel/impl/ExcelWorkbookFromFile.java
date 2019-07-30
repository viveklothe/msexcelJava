package org.viveklothe.excel.impl;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.viveklothe.excel.ExcelWorkbook;
import org.viveklothe.excel.model.CellData;
import org.viveklothe.excel.model.RowData;
import org.viveklothe.excel.model.SheetData;
import org.viveklothe.excel.model.WorkbookData;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * created by VivekLothe on 28/07/2019
 */

public class ExcelWorkbookFromFile implements ExcelWorkbook {

    public WorkbookData getWorkbookDataExcel(String fileName) throws IOException {

        Workbook workbook = WorkbookFactory.create(new File(fileName));
        if(workbook != null){
            WorkbookData workbookData = new WorkbookData();
            workbookData.setWorkbookName(fileName);
            workbook.forEach(sheet -> {
                SheetData sheetData = new SheetData();
                List<RowData> rowDataList = new ArrayList<>();
                sheet.forEach(row -> {
                    RowData rowData = new RowData();
                    List<CellData> cellDataList = new ArrayList<>();
                    row.forEach(cell ->{
                       CellData cellData =new CellData();
                       if(cell.getCellType() == CellType.STRING){
                           cellData.setCellValue(cell.getStringCellValue());
                       }else if(cell.getCellType() == CellType.BOOLEAN){
                           cellData.setCellValue(cell.getBooleanCellValue());
                       }else if(cell.getCellType() == CellType.NUMERIC){
                           cellData.setCellValue(cell.getNumericCellValue());
                       }else if(cell.getCellType() == CellType.BLANK){
                           cellData.setCellValue(null);
                       }else if(cell.getCellType() == CellType.ERROR){
                           cellData.setCellValue(cell.getErrorCellValue());
                       }else if(cell.getCellType() == CellType.FORMULA){
                           cellData.setCellValue(cell.getCellFormula());
                       }
                       cellDataList.add(cellData);
                   });
                    rowData.setCellDataList(cellDataList);
                    rowDataList.add(rowData);
                });
                sheetData.setRowDataList(rowDataList);

            });

            return workbookData;
        }
        return null;
    }
}
