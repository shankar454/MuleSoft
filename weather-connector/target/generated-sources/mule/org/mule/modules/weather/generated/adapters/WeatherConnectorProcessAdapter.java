
package org.mule.modules.weather.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.weather.WeatherConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>WeatherConnectorProcessAdapter</code> is a wrapper around {@link WeatherConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-09-09T06:05:19-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class WeatherConnectorProcessAdapter
    extends WeatherConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<WeatherConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, WeatherConnectorCapabilitiesAdapter> getProcessTemplate() {
        final WeatherConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,WeatherConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, WeatherConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, WeatherConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
