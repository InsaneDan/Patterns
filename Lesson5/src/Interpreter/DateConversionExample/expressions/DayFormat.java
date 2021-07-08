package Interpreter.DateConversionExample.expressions;

import java.time.LocalDate;

public class DayFormat extends AbstractFormat {

    @Override
    public void execute (Format format) {
        String strFormat = format.getFormat();
        LocalDate date = format.getDate();
        Integer day = date.getDayOfMonth();
        String tempFormat = strFormat.replaceAll("DD", day.toString());
        format.setFormat(tempFormat);
    }
}
