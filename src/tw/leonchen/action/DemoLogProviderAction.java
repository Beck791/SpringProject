package tw.leonchen.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.util.LogProvider;
import tw.leonchen.util.LogProvider2;

public class DemoLogProviderAction {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		LogProvider logger = (LogProvider)context.getBean("logProvider");
		logger.log("Message From Action");
		
		
		LogProvider2 logger2 = (LogProvider2)context.getBean("logProvider2");
		logger2.log("New Message");
		
		
		((ConfigurableApplicationContext)context).close();
	}

}  
