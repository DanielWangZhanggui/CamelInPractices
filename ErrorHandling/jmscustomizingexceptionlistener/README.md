=================================
* jmscustomizingexceptionlistener  shows how to catch the JMSException thrown out when endpoint connects to activemq failed.
Since the JMSException is thrown from Spring, we should create a class with implementing ExceptionListener to catch it.
The ExceptionListener just can catch JMSException(More details could be found in [1]). And the spring artifacts shipped in Camel2.12.0 can callback the onException method.



[1] http://docs.spring.io/spring/docs/3.1.0.RELEASE/api/org/springframework/jms/listener/AbstractMessageListenerContainer.html#setExceptionListener(javax.jms.ExceptionListener)

