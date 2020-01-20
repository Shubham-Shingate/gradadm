package com.panther.gradadm;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class GradadmApplication {
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(GradadmApplication.class, args);
	}

	@Bean(name = "orclDataSource")
	public DataSource orclDataSource() {
		// Create Connection Pooled DataSource
		ComboPooledDataSource orclDataSource = new ComboPooledDataSource();

		// Setting the oracle jdbc driver class into DataSource
		try {
			orclDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException exc) {
			throw new RuntimeException(exc);
		}
		// Now set DB credentials
		orclDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		orclDataSource.setUser(env.getProperty("jdbc.user"));
		orclDataSource.setPassword(env.getProperty("jdbc.password"));

		// Set Connection Pool Properties
		orclDataSource.setInitialPoolSize(Integer.parseInt(env.getProperty("connection.pool.initialPoolSize")));
		orclDataSource.setMinPoolSize(Integer.parseInt(env.getProperty("connection.pool.minPoolSize")));
		orclDataSource.setMaxPoolSize(Integer.parseInt(env.getProperty("connection.pool.maxPoolSize")));
		orclDataSource.setMaxIdleTime(Integer.parseInt(env.getProperty("connection.pool.maxIdleTime")));

		return orclDataSource;
	}

}