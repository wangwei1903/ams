package com.tyzx.ams.configurations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @author cabbage
 * @create 2017年5月9日
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
public class ValidationConfiguration {
	// 调试日志
	private static final Logger LOGGER = LoggerFactory.getLogger(ValidationConfiguration.class);

	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor()
	{
		return new MethodValidationPostProcessor();
	}

}
