package com.tyzx.ams.configurations;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author  cabbage
 * @create 2017年5月7日
 * @since  1.0
 */
@Configuration
public class WebConfigurations {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
//	@Bean
//	@Order(0)
//	public FilterRegistrationBean characterEncodingFilter(){
//		FilterRegistrationBean registration = new FilterRegistrationBean();
//		CharacterEncodingFilter filter = new CharacterEncodingFilter();
//        registration.setFilter(filter);
//        registration.addUrlPatterns("/*");
//        registration.addInitParameter("forceEncoding", "true");
//        registration.addInitParameter("encoding", "UTF-8");
//        registration.setName("characterEncodingFilter");
//        return registration;
//	}
	
}

