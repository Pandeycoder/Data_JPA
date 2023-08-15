package pandey.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pandey.com.service.UserMasterService;

@SpringBootApplication
public class DataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DataJpa2Application.class, args);
		
		UserMasterService service=context.getBean(UserMasterService.class);
		//service.userEmail();
		service.finAll();
	}

}
