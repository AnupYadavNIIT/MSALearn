package eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;




@SpringBootApplication
@EnableDiscoveryClient

public class ClientApp {
	public static void main(String[] arg)
	{
	SpringApplication.run(ClientApp.class, arg);
	}
}
