package tw.leonchen.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.Person;

public class DemoPersonAction {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		Person person = (Person)context.getBean("person");
		String nicknaem = person.getNickName();
		System.out.println("nName:"+nicknaem);
		((ConfigurableApplicationContext)context).close(); 
	}

}
