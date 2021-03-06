package org.marketcetera.modules.remote.emitter;

import org.marketcetera.util.misc.ClassVersion;
import org.apache.activemq.transport.TransportListener;

import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import java.io.IOException;

/* $License$ */
/**
 * Provides means to communicate with JMS.
 * This class is not meant to be used by the clients of this package.
 *
 * @author anshul@marketcetera.com
 * @version $Id: MessagingDelegate.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: MessagingDelegate.java 16154 2012-07-14 16:34:05Z colin $")
public class MessagingDelegate
        implements ExceptionListener, TransportListener {
    /**
     * Receives an object
     *
     * @param inObject The received object.
     */

    public void handleMessage(Object inObject) {
        mDataEmitter.receive(inObject);
    }

    @Override
    public void onException(JMSException inException) {
        mDataEmitter.onException(inException);
    }

    @Override
    public void onException(IOException inException) {
        mDataEmitter.onException(inException);
    }

    @Override
    public void onCommand(Object inObject) {
        //do nothing.
    }

    @Override
    public void transportInterupted() {
        //do nothing
    }

    @Override
    public void transportResumed() {
        //do nothing
    }

    /**
     * Sets the module instance that should be receiving the objects and
     * errors recived by this delegate via {@link #handleMessage(Object)},
     * {@link #onException(JMSException)} & {@link #onException(IOException)}. 
     *
     * @param inEmitterModule the module instance.
     */
    void setDataEmitter(RemoteDataEmitter inEmitterModule) {
        mDataEmitter = inEmitterModule;
    }

    private volatile RemoteDataEmitter mDataEmitter;
}