package com.tyzx.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
@EnableConfigurationProperties
public class AmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmsApplication.class, args);
	}
	
	
	@Bean
	public ResourceBundleMessageSource messageSource()
	{
		ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
		resource.setUseCodeAsDefaultMessage(true);
		resource.setBasenames("i18n/exceptions", "i18n/nc_exceptions");
		return resource;
	}
}
