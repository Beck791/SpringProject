package tw.leonchen.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.TruckBean;

public class DemoTruckBeanFactoryAction {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		TruckBean hondaBean = (TruckBean)context.getBean("hondaBean");
		System.out.println("Id1:" + hondaBean .getId());
		System.out.println("Brand1:" + hondaBean .getBrand());
		
		TruckBean nissanBean = (TruckBean)context.getBean("nissanBean");
		System.out.println("Id2:" + nissanBean.getId());
		System.out.println("Brand2:" + nissanBean.getBrand());
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
