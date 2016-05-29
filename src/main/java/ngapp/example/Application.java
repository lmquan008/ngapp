package ngapp.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
	final static Logger logger = LoggerFactory.getLogger(Application.class);

	

	public static void main(String[] args) {
		logger.info("Application Start");
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		context.getBean(SampleService.class).printIt();
	}
}
