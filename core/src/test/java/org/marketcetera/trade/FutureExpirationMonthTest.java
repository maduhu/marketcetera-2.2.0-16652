package org.marketcetera.trade;

import static org.junit.Assert.*;
import org.junit.Test;
import org.marketcetera.module.ExpectedFailure;

/* $License$ */

/**
 * Tests {@link FutureExpirationMonth}.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: FutureExpirationMonthTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.1.0
 */
public class FutureExpirationMonthTest
{
    /**
     * Tests {@link FutureExpirationMonth#getFutureExpirationMonth(char)} and
     * {@link FutureExpirationMonth#getFutureExpirationMonth(String)}.
     *
     * @throws Exception if an unexpected error occurs
     */
    @Test
    public void getFutureExpirationMonth()
            throws Exception
    {
        new ExpectedFailure<NullPointerException>() {
            @Override
            protected void run()
                    throws Exception
            {
                FutureExpirationMonth.getFutureExpirationMonth(null);
            }
        };
        new ExpectedFailure<IllegalArgumentException>() {
            @Override
            protected void run()
                    throws Exception
            {
                FutureExpirationMonth.getFutureExpirationMonth(' ');
            }
        };
        new ExpectedFailure<IllegalArgumentException>() {
            @Override
            protected void run()
                    throws Exception
            {
                FutureExpirationMonth.getFutureExpirationMonth("");
            }
        };
        new ExpectedFailure<IllegalArgumentException>() {
            @Override
            protected void run()
                    throws Exception
            {
                FutureExpirationMonth.getFutureExpirationMonth(" ");
            }
        };
        new ExpectedFailure<IllegalArgumentException>() {
            @Override
            protected void run()
                    throws Exception
            {
                FutureExpirationMonth.getFutureExpirationMonth('E');
            }
        };
        new ExpectedFailure<IllegalArgumentException>() {
            @Override
            protected void run()
                    throws Exception
            {
                FutureExpirationMonth.getFutureExpirationMonth("E");
            }
        };
        int index = 0;
        for(FutureExpirationMonth expirationMonth : FutureExpirationMonth.values()) {
            assertEquals(FutureExpirationMonth.values()[index],
                         FutureExpirationMonth.getFutureExpirationMonth(expirationMonth.getCode()));
            assertEquals(FutureExpirationMonth.values()[index],
                         FutureExpirationMonth.getFutureExpirationMonth(Character.toLowerCase(expirationMonth.getCode())));
            assertEquals(FutureExpirationMonth.values()[index],
                         FutureExpirationMonth.getFutureExpirationMonth(new StringBuffer().append(expirationMonth.getCode()).toString()));
            assertEquals(FutureExpirationMonth.values()[index],
                         FutureExpirationMonth.getFutureExpirationMonth(new StringBuffer().append(expirationMonth.getCode()).toString().toLowerCase()));
            index += 1;
        }
    }
}
