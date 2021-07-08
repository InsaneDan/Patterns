package Interpreter.DateConversionExample;

import Interpreter.DateConversionExample.expressions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoAppInterpreter {

    public static void main (String[] args) {

        System.out.println("Please input Date Format: 'MM-DD-YYYY' or 'YYYY-MM-DD' or 'DD-MM-YYYY' ");
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.next();

        Format format = new Format();
        format.setFormat(inputDate);
        format.setDate(LocalDate.now());

        ArrayList<AbstractFormat> formatOrderList = getFormatOrder(format);

        System.out.println("Input: " + format.getFormat() + " : " + LocalDate.now());

        for (AbstractFormat abstractFormat : formatOrderList) {
            abstractFormat.execute(format);
            System.out.println(abstractFormat.getClass().getSimpleName() + " conversion: " + format.getFormat());
        }

        System.out.println("Output: " + format.getFormat());
    }

    private static ArrayList<AbstractFormat> getFormatOrder (Format format) {

        ArrayList<AbstractFormat> formatOrderList = new ArrayList<AbstractFormat>();
        String[] strArray = format.getFormat().split("-");

        for (String str : strArray) {
            if (str.equalsIgnoreCase("MM")) {
                formatOrderList.add(new MonthFormat());
            } else if (str.equalsIgnoreCase("DD")) {
                formatOrderList.add(new DayFormat());
            } else if( str.equalsIgnoreCase("YYYY") ) {
                formatOrderList.add(new YearFormat());
            } else {
                System.out.println("WRONG FORMAT!!!");
            }
        }

        return formatOrderList;
    }

}

/* РЕЗУЛЬТАТ:

Please input Date Format: 'MM-DD-YYYY' or 'YYYY-MM-DD' or 'DD-MM-YYYY'
DD-MM-YYYY
Input: DD-MM-YYYY : 2021-07-08
DayFormat conversion: 8-MM-YYYY
MonthFormat conversion: 8-7-YYYY
YearFormat conversion: 8-7-2021
Output: 8-7-2021

*/