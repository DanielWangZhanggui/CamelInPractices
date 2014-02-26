package mq.test.dan;

import javax.jms.ExceptionListener;
import javax.jms.JMSException;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.CamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ErrorHandler;

public class JMSCustomizingExceptionListener implements ExceptionListener
{
	public static void main(String args[]) throws Exception
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./META-INF/spring/camelContext.xml");
		
		CamelContext context = (CamelContext) applicationContext.getBean("camelContext");
		context.start();
		Thread.sleep(3000);
	}
	
	public void onException(JMSException arg0) {
		System.out.println("~~~~~~~~~~Have just catched the JMSException: \t" + arg0.getMessage() + "~~~~~~~~~~~~~~");
	}
}