package org.viveklothe.excel.model;

import java.util.List;

public class SheetData {
    String sheetName;
    List<RowData> rowDataList;

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public List<RowData> getRowDataList() {
        return rowDataList;
    }

    public void setRowDataList(List<RowData> rowDataList) {
        this.rowDataList = rowDataList;
    }
}
