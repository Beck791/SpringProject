package tw.leonchen.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.TruckBean;

public class DemoTruckBeanStaticFactoryAction {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		TruckBean fordBean = (TruckBean)context.getBean("fordBean");
		System.out.println("Id1:" + fordBean.getId());
		System.out.println("Brand1:" + fordBean.getBrand());
		
		TruckBean porscheBean = (TruckBean)context.getBean("porscheBean");
		System.out.println("Id2:" + porscheBean.getId());
		System.out.println("Brand2:" + porscheBean.getBrand());
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
