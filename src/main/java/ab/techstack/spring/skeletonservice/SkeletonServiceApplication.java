package ab.techstack.spring.skeletonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SkeletonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkeletonServiceApplication.class, args);
	}

}
