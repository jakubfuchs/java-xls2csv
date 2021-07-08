package com.github.jakubfuchs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testDecimalSeparator() {
        DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance(Locale.UK);
        assertEquals('.', formatter.getDecimalFormatSymbols().getDecimalSeparator()); //true

        formatter = (DecimalFormat) DecimalFormat.getInstance(Locale.GERMAN);
        assertEquals(',', formatter.getDecimalFormatSymbols().getDecimalSeparator()); //true


        //and in case you want another decimal separator for a specific locale
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');

        formatter.setDecimalFormatSymbols(decimalFormatSymbols);
        assertEquals(',', formatter.getDecimalFormatSymbols().getDecimalSeparator()); //true
    }
}
