package Spring.com.spring2maven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    
    Student sts =(Student)ctx.getBean("st");
    System.out.println(sts);
    }
}
