package org.marketcetera.photon.internal.marketdata;

import java.util.Set;

import org.marketcetera.marketdata.Capability;
import org.marketcetera.photon.model.marketdata.impl.MDDepthOfBookImpl;
import org.marketcetera.util.misc.ClassVersion;

import com.google.inject.ImplementedBy;

/* $License$ */

/**
 * Interface for a manger of market depth data flows.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: IDepthOfBookManager.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.5.0
 */
@ClassVersion("$Id: IDepthOfBookManager.java 16154 2012-07-14 16:34:05Z colin $")
public interface IDepthOfBookManager extends IDataFlowManager<MDDepthOfBookImpl, DepthOfBookKey> {

	/**
	 * Factory for creating IDepthOfBookManagers.
	 */
	@ClassVersion("$Id: IDepthOfBookManager.java 16154 2012-07-14 16:34:05Z colin $")
	@ImplementedBy(DepthOfBookManager.FactoryImpl.class)
	public interface Factory {

		/**
		 * Creates an IDepthOfBookManager that handles the provided Capabilities.
		 * 
		 * @param capabilities
		 *            the depth of book capabilities this manager should handle
		 * @return the manager instance
		 */
		IDepthOfBookManager create(Set<Capability> capabilities);

	}

}
