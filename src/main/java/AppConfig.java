import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.metafourarnob.repository.CustomerRepository;
import com.metafourarnob.repository.HibernateCustomerRepositoryImpl;
import com.metafourarnob.service.CustomerService;
import com.metafourarnob.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name= "customerService")
	public CustomerService getCustomerService(){
		
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}

	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}

}