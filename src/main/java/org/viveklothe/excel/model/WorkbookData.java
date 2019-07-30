package org.viveklothe.excel.model;

import java.util.List;

public class WorkbookData {
    String workbookName;
    List<SheetData> sheetDataList;

    public String getWorkbookName() {
        return workbookName;
    }

    public void setWorkbookName(String workbookName) {
        this.workbookName = workbookName;
    }

    public List<SheetData> getSheetDataList() {
        return sheetDataList;
    }

    public void setSheetDataList(List<SheetData> sheetDataList) {
        this.sheetDataList = sheetDataList;
    }
}
