package study.addressuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AddressUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressUserApplication.class, args);
	}

}
