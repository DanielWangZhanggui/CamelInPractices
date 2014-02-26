Set up some cases about Error Handling
====================================
Camel’s error handling doesn’t apply everywhere.Imagine you have a file consumer and producer as the input and output facilities, and in between is the Camel routing engine, which routes messages encompassed in an exchange. It’s during the lifecycle of this exchange that the Camel error handling applies. That leaves a little room on the input side where this error handling can’t operate—the file consumer must be able to successfully read the file, instantiate the Exchange, and start the routing before the error handling can function. This applies to any kind of Camel consumer.
So what happens if the file consumer can’t read the file? The answer is component specific, and each Camel component must deal with this in its own way. Some components will ignore and skip the message, others will retry a number of times, and others will gracefully recover.

* jmscustomizingexceptionlistener  shows how to catch the JMSException thrown out when endpoint connects to activemq failed.
Since the JMSException is thrown from Spring, we should create a class with implementing ExceptionListener to catch it. 
The ExceptionListener just can catch JMSException(More details could be found in [1]). And the spring artifacts shipped in Camel2.12.0 can callback the onException method.



[1] http://docs.spring.io/spring/docs/3.1.0.RELEASE/api/org/springframework/jms/listener/AbstractMessageListenerContainer.html#setExceptionListener(javax.jms.ExceptionListener)
