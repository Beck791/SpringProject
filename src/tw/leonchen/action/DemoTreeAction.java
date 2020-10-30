package tw.leonchen.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.Tree;
import tw.leonchen.model.Tree2;

public class DemoTreeAction {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		Tree tree = (Tree)context.getBean("tree");
		System.out.println("tree name:" + tree.getName());
		System.out.println("tree name:" + tree.getAge());
		
		Tree2 tree2 = (Tree2)context.getBean("tree2");
		System.out.println("tree name:" + tree2.getName());
		System.out.println("tree name:" + tree2.getAge());
		
		((ConfigurableApplicationContext) context).close();
	}

}
