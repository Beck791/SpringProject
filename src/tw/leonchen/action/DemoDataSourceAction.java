package tw.leonchen.action;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.leonchen.model.House;
import tw.leonchen.model.HouseDAO;
import tw.leonchen.model.HouseService;

public class DemoDataSourceAction {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		HouseService houseService = (HouseService) context.getBean("houseService");
		House hbean = houseService.select(1001);
		System.out.println("id1:"+hbean.getHouseid());
		System.out.println("Housename1:"+hbean.getHousename());
		
		HouseDAO houseDAO = (HouseDAO) context.getBean("houseDao");
		House hbean1 = houseDAO.select(1003);
		System.out.println("id1:"+hbean1.getHouseid());
		System.out.println("Housename1:"+hbean1.getHousename());
		
		((ConfigurableApplicationContext) context).close();
	}

}
