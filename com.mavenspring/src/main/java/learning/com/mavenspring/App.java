package learning.com.mavenspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
public static void main(String[] args) {
	ClassPathXmlApplicationContext	ctx=new ClassPathXmlApplicationContext("config.xml");
      Trainer bean = (Trainer)ctx.getBean("tr");
	System.out.println(bean);

}
}  

