package org.marketcetera.marketdata;

import org.marketcetera.core.ClassVersion;

/* $License$ */

/**
 * Test implementation of {@link AbstractMarketDataFeedToken}.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: MockMarketDataFeedToken.java 16154 2012-07-14 16:34:05Z colin $
 * @since 0.5.0
 */
@ClassVersion("$Id: MockMarketDataFeedToken.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class MockMarketDataFeedToken
    extends AbstractMarketDataFeedToken<MockMarketDataFeed>
{
    private String mHandle;
    private boolean mShouldFail = false;
    /**
     * Create a new <code>TestMarketDataFeedToken</code> instance.
     *
     * @param inFixMessage
     */
    private MockMarketDataFeedToken(MarketDataFeedTokenSpec inTokenSpec,
                                    MockMarketDataFeed inFeed)
    {
        super(inTokenSpec,
              inFeed);
    }
    
    static MockMarketDataFeedToken getToken(MarketDataFeedTokenSpec inTokenSpec,
                                            MockMarketDataFeed inFeed)
    {        
        return new MockMarketDataFeedToken(inTokenSpec,
                                           inFeed);
    }
    void setHandle(String inHandle)
    {
        mHandle = inHandle;
    }
    public String getHandle()
    {
        return mHandle;
    }
    /**
     * @return the shouldFail
     */
    public boolean getShouldFail()
    {
        return mShouldFail;
    }

    /**
     * @param inShouldFail the shouldFail to set
     */
    public void setShouldFail(boolean inShouldFail)
    {
        mShouldFail = inShouldFail;
    }
}
