package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TacoCloudApplication implements WebMvcConfigurer {

	//http://localhost:8080/design

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}
}
