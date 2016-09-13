package org.mule.modules.weather;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.modules.weather.config.ConnectorConfig;

@Connector(name="weather", friendlyName="Weather", minMuleVersion = "3.7")
public class WeatherConnector {

    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}