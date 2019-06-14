package i.t.p;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStart {
   public static void main(String[] args) throws IOException
   {
	   ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("*.xml");
	   context.start();
	   System.out.println("register service is running");
	   System.in.read();
   }
}
