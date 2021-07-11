package Interpreter.DateConversionExample.expressions;

import java.time.LocalDate;

public class YearFormat extends AbstractFormat {

    @Override
    public void execute (Format format) {
        String strFormat = format.getFormat();
        LocalDate date = format.getDate();
        Integer year = date.getYear();
        String tempFormat = strFormat.replaceAll("YYYY", year.toString());
        format.setFormat(tempFormat);
    }
}
