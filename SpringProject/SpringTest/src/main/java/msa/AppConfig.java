package msa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfig {
	public static void main(String[] arg){
		ApplicationContext contxt = new AnnotationConfigApplicationContext(HelloWorld.class);
		HelloWorld config = contxt.getBean(HelloWorld.class);
		
		config.setName("Anup");
		System.out.println("name: "+config.getName());
	}

}
