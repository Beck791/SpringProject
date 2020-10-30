package tw.leonchen.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.LoginDAO;
import tw.leonchen.model.LoginService;

public class DemoLoginAction2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		LoginDAO lgDao = (LoginDAO)context.getBean("lgDao");
		boolean status = lgDao.cheackLogin("John", "test123");
		System.out.println("status: " + status);
 
		
		LoginService lgService = (LoginService)context.getBean("lgService");
		boolean status1 = lgService.cheackLogin("John", "test123");
		System.out.println("status1: " + status1);
		
		
		((ConfigurableApplicationContext)context).close(); 
	}

}
