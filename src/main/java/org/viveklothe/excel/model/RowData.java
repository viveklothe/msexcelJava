package org.viveklothe.excel.model;

import java.util.List;

public class RowData {
    int rowNumber;
    List<CellData> cellDataList;

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public List<CellData> getCellDataList() {
        return cellDataList;
    }

    public void setCellDataList(List<CellData> cellDataList) {
        this.cellDataList = cellDataList;
    }
}
