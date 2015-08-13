package com.fruit.usermanagement.config;

import javax.sql.DataSource;

import org.mpilone.jdbc.PoolDataSourceBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


@Configuration
public class DatasourceConfig {

//	@Value( "${db.url}" )
//	private String url;
//
//	@Value( "${db.user}" )
//	private String user;
//
//	@Value( "${db.password}" )
//	private String password;
//
//	@Value( "${db.autoCommit}" )
//	private String autoCommit;
//
//	@Value( "${db.fastConnectionFailoverEnabled}" )
//	private boolean fastConnectionFailoverEnabled;
//
//	@Value( "${db.poolName}" )
//	private String poolName;
//
//	@Value( "${db.connWaitTimeout}" )
//	private int connWaitTimeout;
//
//	@Value( "${db.minPoolSize}" )
//	private int minPoolSize;
//
//	@Value( "${db.maxPoolSize}" )
//	private int maxPoolSize;
//
//	@Value( "${db.inactiveConnTimeout}" )
//	private int inactiveConnTimeout;
//
//	@Value( "${db.timeoutCheckInterval}" )
//	private int timeoutCheckInterval;
//
//	@Value( "${db.validateConnOnBorrow}" )
//	private boolean validateConnOnBorrow;
	
    private String url = "jdbc:mysql://localhost:3306/mysql";
    private String userName = "root";
    private String passWord = "root";

//	@Bean
//	public PoolDataSourceBeanPostProcessor poolDataSourceBeanPostProcessor() {
//		return new PoolDataSourceBeanPostProcessor();
//	}

	@Bean
	public DataSource dataSource() throws Exception {

//		PoolDataSource dataSource = PoolDataSourceFactory.getPoolDataSource();
//
//		dataSource.setURL( this.url );
//		dataSource.setUser( this.user );
//		dataSource.setPassword( this.password );
//
//		dataSource.setConnectionProperty( "autoCommit", this.autoCommit );
//
//		dataSource.setFastConnectionFailoverEnabled( this.fastConnectionFailoverEnabled );
//		dataSource.setConnectionFactoryClassName( "oracle.jdbc.pool.OracleDataSource" );
//		dataSource.setConnectionWaitTimeout( this.connWaitTimeout );
//		dataSource.setMinPoolSize( this.minPoolSize );
//		dataSource.setMaxPoolSize( this.maxPoolSize );
//		dataSource.setInactiveConnectionTimeout( this.inactiveConnTimeout );
//		dataSource.setTimeoutCheckInterval( this.timeoutCheckInterval );
//		dataSource.setValidateConnectionOnBorrow( this.validateConnOnBorrow );
//		dataSource.setConnectionPoolName( this.poolName );
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setURL(this.url);
		dataSource.setPassword(this.passWord);
		dataSource.setUser(this.userName);

		return dataSource;

	}

}
