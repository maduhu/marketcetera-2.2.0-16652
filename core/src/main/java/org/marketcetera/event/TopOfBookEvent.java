package org.marketcetera.event;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Represents the Top-of-Book or Best-Bid-and-Offer for a specific instrument
 * at a specific point in time.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: TopOfBookEvent.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: TopOfBookEvent.java 16154 2012-07-14 16:34:05Z colin $")
public interface TopOfBookEvent
        extends AggregateEvent
{
    /**
     * Get the bid value.
     *
     * @return a <code>BidEvent</code> value
     */
    public BidEvent getBid();
    /**
     * Get the ask value.
     *
     * @return a <code>AskEvent</code> value
     */
    public AskEvent getAsk();
}
