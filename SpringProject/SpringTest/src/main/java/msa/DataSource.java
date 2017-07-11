package msa;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataSource {
	
	@Bean
	public javax.sql.DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhose:3306/MSA");
		dataSource.setUsername("root");
		dataSource.setPassword("root");				
		return dataSource;
	}
	@Bean
	public EntityManagerFactory entityManagerFactory(javax.sql.DataSource datasource)
	{
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(datasource);
		em.setPackagesToScan("");
		em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		
		return em.getObject();
			
		
	}
		

}
