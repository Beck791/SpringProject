package tw.leonchen.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.Person;

public class DemoPersonAction {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		Person person1 = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person");
		
		System.out.println("person1:" + person1.hashCode());
		System.out.println("person2:" + person2.hashCode());
		
//		Person person = (Person) context.getBean("person");
//		String nicknaem = person.getNickName();
//		System.out.println("nName:" + nicknaem);

//		Person person1 = (Person) context.getBean("person1");
//
//		System.out.println("Role:" + person1.getRole());
//		System.out.println("Age:" + person1.getAge());
//
//		Person person2 = (Person) context.getBean("person2");
//		System.out.println("Role:" + person2.getDate());
//
//		Person person3 = (Person) context.getBean("person3");
//		List<String> foodList = person3.getFood();
//		
//		System.out.println("My Favorite Food :");
//		for (int i = 0; i < foodList.size(); i++) {
//			System.out.println(foodList.get(i));
//		}
//
//		Person person4 = (Person) context.getBean("person4");
//		System.out.println("Name1:" + person4.getName());
//		
//		Person person5 = (Person) context.getBean("person5");
//		System.out.println("Name2:" + person5.getName());
		
		((ConfigurableApplicationContext) context).close();
	}

}
