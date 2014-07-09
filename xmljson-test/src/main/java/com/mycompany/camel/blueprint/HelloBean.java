package com.mycompany.camel.blueprint;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import org.apache.commons.io.IOUtils;

/**
 * A bean which we use in the route
 */
public class HelloBean implements Hello {

    private String say = "Hello World";
    private final static Logger LOGGER = Logger.getLogger(HelloBean.class.toString());

    public String hello() throws IOException {
    	InputStream inStream = getClass().getClassLoader().getResourceAsStream("testMessage1.xml");
        return IOUtils.toString(inStream, "UTF-8");
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }
}
