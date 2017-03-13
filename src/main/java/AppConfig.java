import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.metafourarnob.service.CustomerService;
import com.metafourarnob.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.metafourarnob"})
public class AppConfig {
	
//	@Bean(name= "customerService")
//	public CustomerService getCustomerService(){
////		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//		CustomerServiceImpl service = new CustomerServiceImpl();
////		service.setCustomerRepository(getCustomerRepository());
//		return service;
//	}

//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository(){
//		return new HibernateCustomerRepositoryImpl();
//	}

}