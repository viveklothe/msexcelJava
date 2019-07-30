package org.viveklothe.excel.model;

public class CellData {
    String cellName;
    Object cellValue;
    char cellColumnName;
    int cellRowNumber;

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public Object getCellValue() {
        return cellValue;
    }

    public void setCellValue(Object cellValue) {
        this.cellValue = cellValue;
    }

    public char getCellColumnName() {
        return cellColumnName;
    }

    public void setCellColumnName(char cellColumnName) {
        this.cellColumnName = cellColumnName;
    }

    public int getCellRowNumber() {
        return cellRowNumber;
    }

    public void setCellRowNumber(int cellRowNumber) {
        this.cellRowNumber = cellRowNumber;
    }
}
