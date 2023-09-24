package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TacoCloudApplication implements WebMvcConfigurer {

	//http://localhost:8080/design
	//http://localhost:8080/h2-console

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}
}
