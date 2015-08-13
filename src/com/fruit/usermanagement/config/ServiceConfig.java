package com.fruit.usermanagement.config;

import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.nativejdbc.CommonsDbcpNativeJdbcExtractor;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories( "com.fruit.usermanagement.backend.repository.jpa" )
@EnableTransactionManagement
@ComponentScan( basePackages = {
	"com.fruit.usermanagement.backend.service",
})
@Import( value = {
	DatasourceConfig.class,
})
public class ServiceConfig {

	@Autowired
	private DataSource dataSource;

	@Bean
	public JdbcTemplate jdbcTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		jdbcTemplate.setDataSource( this.dataSource );
		jdbcTemplate.setNativeJdbcExtractor( nativeJdbcExtractor() );

		return jdbcTemplate;

	}

	@Bean
	@Lazy
	public CommonsDbcpNativeJdbcExtractor nativeJdbcExtractor() {
		return new CommonsDbcpNativeJdbcExtractor();
	}

	@Bean
	public PlatformTransactionManager transactionManager() {

		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();

		jpaTransactionManager.setEntityManagerFactory( entityManagerFactory().getObject() );

		return jpaTransactionManager;

	}

	@Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

		entityManagerFactoryBean.setPersistenceProvider( new HibernatePersistence() );
		entityManagerFactoryBean.setDataSource( this.dataSource );
		
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		
		jpaVendorAdapter.setDatabase( Database.ORACLE );
		jpaVendorAdapter.setGenerateDdl( false );
		
		entityManagerFactoryBean.setJpaVendorAdapter( jpaVendorAdapter );

		return entityManagerFactoryBean;

    }

}
