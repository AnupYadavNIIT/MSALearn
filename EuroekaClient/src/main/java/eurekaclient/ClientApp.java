package eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@SpringBootApplication
@EnableDiscoveryClient
@EnableWebMvc


public class ClientApp {
	public static void main(String[] arg)
	{
	SpringApplication.run(ClientApp.class, arg);
	}
}
