package tw.leonchen.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.LoginDAO;
import tw.leonchen.model.LoginService;

public class DemoLoginAction {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		LoginDAO loginDao = (LoginDAO)context.getBean("loginDao");
		boolean status = loginDao.cheackLogin("John", "test123");
		System.out.println("status: " + status);
		
		LoginService loginService = (LoginService)context.getBean("loginService1");
		boolean	status1 =loginService.cheackLogin("John", "test123");
		System.out.println("status: " + status1);
		
		boolean	status2 =loginService.cheackLogin("Marry", "test123");
		System.out.println("status: " + status2);
		
		LoginService loginService2 = (LoginService)context.getBean("loginService2");
		boolean	status3 =loginService2.cheackLogin("John", "test123");
		System.out.println("status: " + status3);
		
		((ConfigurableApplicationContext)context).close(); 
	}

}
