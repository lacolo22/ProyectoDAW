package pe.cibertec.ecommerce.eurekaserver.EuerkaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EuerkaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuerkaServerApplication.class, args);
	}

}
