- features:install camel-servlet
- osgi:install -s mvn:demo.camel/servlet-blueprint.client/1.0.0
- osgi:install -s mvn:demo.camel/servlet.blueprint.service/1.0.0
- config:edit org.ops4j.pax.web
- config:proplist
~~~
   service.pid = org.ops4j.pax.web
   org.osgi.service.http.port = 8181
   org.ops4j.pax.web.config.file = etc/jetty.xml
   felix.fileinstall.filename = file:/home/daniel/programs/jboss-fuse-6.1.0.redhat-379/etc/org.ops4j.pax.web.cfg
~~~
- config:cancel 

Post a request to localhost:8181/hello 


