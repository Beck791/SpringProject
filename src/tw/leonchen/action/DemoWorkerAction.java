package tw.leonchen.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.WorkerDAO;

public class DemoWorkerAction {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		WorkerDAO workerDao = (WorkerDAO)context.getBean("workerDao");
		workerDao.printResult();
		
		
		
		
		((ConfigurableApplicationContext)context).close(); 
	}

}
