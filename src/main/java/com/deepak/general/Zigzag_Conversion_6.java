package com.deepak.general;

public class Zigzag_Conversion_6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] rows  =  new StringBuilder[numRows];
        for (int i =0; i<numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char currentChar : s.toCharArray()) {
            rows[currentRow].append(currentChar);
            if (currentRow == 0 || currentRow == numRows-1) {
                goingDown = !goingDown;
            }
            currentRow = currentRow + (goingDown?1:-1);
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : rows) {
            result.append(stringBuilder);
        }
        return result.toString();
    }
}
