package Interpreter.DateConversionExample.expressions;

import java.time.LocalDate;

public class MonthFormat extends AbstractFormat {

    @Override
    public void execute (Format format) {
        String strFormat = format.getFormat();
        LocalDate date = format.getDate();
        Integer month = date.getMonthValue();
        String tempFormat = strFormat.replaceAll("MM", month.toString());
        format.setFormat(tempFormat);
    }
}
