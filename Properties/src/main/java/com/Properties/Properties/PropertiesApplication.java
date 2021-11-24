package com.Properties.Properties;

import com.Properties.Properties.entity.ForNewProperties;
import com.Properties.Properties.entity.MyProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableConfigurationProperties(MyProperties.class)
public class PropertiesApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("two")
	private MyProperties myProperties;

	@Autowired
	private ForNewProperties forNewProperties;

	public static void main(String[] args) {
		SpringApplication.run(PropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(myProperties);
		System.out.println("forNewProperties " + forNewProperties);
	}

	// @Bean
	// ApplicationRunner applicationRunner(MyProperties myProperties) {
	// return args -> {
	// System.out.println(myProperties);
	// };
	// }

}
