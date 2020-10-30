package tw.leonchen.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.Person;
import tw.leonchen.model.SpringJavaConfig;
import tw.leonchen.model.WorkerDAO;

public class DemoWorkerAction2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		WorkerDAO workerDao2 = (WorkerDAO)context.getBean("workerDao2");
		workerDao2.printResult();
		
		Person person7 = (Person) context.getBean("person7");
		System.out.println("Age:" + person7.getAge());
		
		
		((ConfigurableApplicationContext)context).close(); 
	}

}
