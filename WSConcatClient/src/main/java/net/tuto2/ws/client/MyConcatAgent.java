
package net.tuto2.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "MyConcatAgent", targetNamespace = "http://concat.service.ws.tuto2.net/", wsdlLocation = "http://localhost:8080/WSConcatService/services/concat?wsdl")
public class MyConcatAgent
    extends Service
{

    private final static URL MYCONCATAGENT_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(net.tuto2.ws.client.MyConcatAgent.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = net.tuto2.ws.client.MyConcatAgent.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/WSConcatService/services/concat?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/WSConcatService/services/concat?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        MYCONCATAGENT_WSDL_LOCATION = url;
    }

    public MyConcatAgent(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyConcatAgent() {
        super(MYCONCATAGENT_WSDL_LOCATION, new QName("http://concat.service.ws.tuto2.net/", "MyConcatAgent"));
    }

    /**
     * 
     * @return
     *     returns WSConcat
     */
    @WebEndpoint(name = "WSConcatImplPort")
    public WSConcat getWSConcatImplPort() {
        return super.getPort(new QName("http://concat.service.ws.tuto2.net/", "WSConcatImplPort"), WSConcat.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSConcat
     */
    @WebEndpoint(name = "WSConcatImplPort")
    public WSConcat getWSConcatImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://concat.service.ws.tuto2.net/", "WSConcatImplPort"), WSConcat.class, features);
    }

}
