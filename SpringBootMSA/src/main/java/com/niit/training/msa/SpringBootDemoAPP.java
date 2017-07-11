package com.niit.training.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer

public class SpringBootDemoAPP {
	public static void main(String[] arg)
	{
		SpringApplication.run(SpringBootDemoAPP.class, arg);
	}

}
