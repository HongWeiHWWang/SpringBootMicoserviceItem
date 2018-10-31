package com.nbs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient  //声明应用是Eureka的客户端
@SpringBootApplication
public class ItemApplication {
	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}

}
