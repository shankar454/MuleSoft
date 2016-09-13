
package org.mule.modules.weather.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.weather.WeatherConnector;


/**
 * A <code>WeatherConnectorCapabilitiesAdapter</code> is a wrapper around {@link WeatherConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-09-09T06:05:19-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class WeatherConnectorCapabilitiesAdapter
    extends WeatherConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
