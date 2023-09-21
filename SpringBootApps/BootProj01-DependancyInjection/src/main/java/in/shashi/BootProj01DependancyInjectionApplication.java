package in.shashi;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.shashi.comp.WishMessageGenerator;

@SpringBootApplication
public class BootProj01DependancyInjectionApplication {
	
	@Bean("ldt")
	public LocalDateTime time() {
		LocalDateTime ldt = LocalDateTime.now();
		return ldt;	
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProj01DependancyInjectionApplication.class, args);
		
		WishMessageGenerator generator = context.getBean(WishMessageGenerator.class);
		String message = generator.greetMessage("Shashi");
		System.out.println(message);
		
		((ConfigurableApplicationContext) context).close();
	}

}
