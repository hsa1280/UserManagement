package com.fruit.usermanagement.test.factory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fruit.usermanagement.test.factory.impl.FacilityObjectFactory;
import com.fruit.usermanagement.test.factory.impl.UserObjectFactory;

@Configuration
public class ObjectFactoryConfiguration {

	@Bean
	public UserObjectFactory userManagementObjectFactory() throws Exception {
		return new UserObjectFactory();
	}
	
	@Bean
	public FacilityObjectFactory facilityObjectFactory() throws Exception {
		return new FacilityObjectFactory();
	}

}
