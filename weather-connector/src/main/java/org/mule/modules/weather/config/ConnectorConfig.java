package org.mule.modules.weather.config;

import java.util.ArrayList;
import java.util.List;

import org.mule.api.annotations.components.WsdlProvider;
import org.mule.api.annotations.ws.WsdlServiceEndpoint;
import org.mule.api.annotations.ws.WsdlServiceRetriever;
import org.mule.devkit.api.ws.definition.DefaultServiceDefinition;
import org.mule.devkit.api.ws.definition.ServiceDefinition;

@WsdlProvider(friendlyName = "Configuration")
public class ConnectorConfig {

    @WsdlServiceRetriever
    public List<ServiceDefinition> getServiceDefinitions() {

        final List<ServiceDefinition> serviceDefinitions = new ArrayList<ServiceDefinition>();

        serviceDefinitions.add(new DefaultServiceDefinition(
                "GlobalWeather_GlobalWeatherSoap",
                "globalweather.asmx (GlobalWeatherSoap)",
                "http://www.webservicex.com/globalweather.asmx?WSDL",
                "GlobalWeather",
                "GlobalWeatherSoap"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "GlobalWeather_GlobalWeatherHttpPost",
                "globalweather.asmx (GlobalWeatherHttpPost)",
                "http://www.webservicex.com/globalweather.asmx?WSDL",
                "GlobalWeather",
                "GlobalWeatherHttpPost"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "GlobalWeather_GlobalWeatherHttpGet",
                "globalweather.asmx (GlobalWeatherHttpGet)",
                "http://www.webservicex.com/globalweather.asmx?WSDL",
                "GlobalWeather",
                "GlobalWeatherHttpGet"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "GlobalWeather_GlobalWeatherSoap12",
                "globalweather.asmx (GlobalWeatherSoap12)",
                "http://www.webservicex.com/globalweather.asmx?WSDL",
                "GlobalWeather",
                "GlobalWeatherSoap12"));
        return serviceDefinitions;
    }

    @WsdlServiceEndpoint
    public String getServiceEndpoint(ServiceDefinition definition) {
        String result;
        final String id = definition.getId();
        switch(id){
                case "GlobalWeather_GlobalWeatherSoap": {
                result = "http://www.webservicex.com/globalweather.asmx";
                break;
            }
                case "GlobalWeather_GlobalWeatherHttpPost": {
                result = "http://www.webservicex.com/globalweather.asmx";
                break;
            }
                case "GlobalWeather_GlobalWeatherHttpGet": {
                result = "http://www.webservicex.com/globalweather.asmx";
                break;
            }
                case "GlobalWeather_GlobalWeatherSoap12": {
                result = "http://www.webservicex.com/globalweather.asmx";
                break;
            }
                default: {
                throw new IllegalArgumentException(id + " endpoint could not be resolved.");
            }
        }
        return result;
    }


}