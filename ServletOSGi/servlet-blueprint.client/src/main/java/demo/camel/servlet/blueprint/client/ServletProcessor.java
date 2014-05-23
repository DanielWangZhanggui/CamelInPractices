package demo.camel.servlet.blueprint.client;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServletProcessor implements Processor {
    private static final Logger LOG = LoggerFactory.getLogger(ServletProcessor.class);

    public void process(Exchange exchange) throws Exception {
        String request = exchange.getIn().getBody(String.class);
        LOG.info("*** get the request is " + request);
        exchange.getOut().setBody("Echo BluePrint" + request);
    }

}
