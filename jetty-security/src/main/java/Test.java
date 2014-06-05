import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: daniel
 * Date: 6/5/14
 * Time: 12:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test
{
    public static void main(String []args)
    {
        new ClassPathXmlApplicationContext("/META-INF/spring/camelContext.xml");
    }
}
