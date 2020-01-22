package com.yavdhesh.springsecuritydemo;

import java.beans.PropertyVetoException;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.jboss.C3P0PooledDataSource;

@Configuration
@ComponentScan(basePackages={"com.yavdhesh.springsecuritydemo"}) //context:component-scan basepackages
@EnableWebMvc // context:mvc-annotation driver
@EnableAspectJAutoProxy // spectj autoproxy 
@EnableTransactionManagement // transacion annotation drivern
@PropertySource(value={"classpath:persistence-mysql.properties"})
public class SpringApplicationConfig {
	
	@Autowired
	private Environment environment;
	
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver rs= new InternalResourceViewResolver("/WEB-INF/view/",".jsp");
		return rs;
	}
	
	@Primary
	@Bean
	public DataSource dataSource() throws PropertyVetoException{
ComboPooledDataSource dataSource = new ComboPooledDataSource();
dataSource.setJdbcUrl(environment.getProperty("jdbc.url"));
dataSource.setUser(environment.getProperty("jdbc.user"));
dataSource.setPassword(environment.getProperty("jdbc.password"));
dataSource.setDriverClass(environment.getProperty("jdbc.driver"));

dataSource.setMinPoolSize(Integer.parseInt(environment.getProperty("connection.pool.minPoolSize")));
dataSource.setMaxPoolSize(Integer.parseInt(environment.getProperty("connection.pool.maxPoolSize")));
dataSource.setMaxIdleTime(Integer.parseInt(environment.getProperty("connection.pool.maxIdleTime")));

return dataSource;

	}


}
