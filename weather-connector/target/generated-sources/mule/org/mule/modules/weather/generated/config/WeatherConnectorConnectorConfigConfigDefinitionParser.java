
package org.mule.modules.weather.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.devkit.internal.lic.AbstractEEDefinitionParser;
import org.mule.modules.weather.config.ConnectorConfig;
import org.mule.modules.weather.generated.adapters.WeatherConnectorConnectorConfigWsdlProviderAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-09-09T06:05:19-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class WeatherConnectorConnectorConfigConfigDefinitionParser
    extends AbstractEEDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(WeatherConnectorConnectorConfigConfigDefinitionParser.class);

    public String moduleName() {
        return "Weather";
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, WeatherConnectorConnectorConfigWsdlProviderAdapter.class);
        setDestroyMethodIfNeeded(builder, WeatherConnectorConnectorConfigWsdlProviderAdapter.class);
        BeanDefinitionBuilder wsdlProviderStrategyBuilder = BeanDefinitionBuilder.rootBeanDefinition(ConnectorConfig.class.getName());
        builder.addPropertyValue("config", wsdlProviderStrategyBuilder.getBeanDefinition());
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(WeatherConnectorConnectorConfigWsdlProviderAdapter.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the configuration [config] within the connector [weather] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the configuration [config] within the connector [weather] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

}
