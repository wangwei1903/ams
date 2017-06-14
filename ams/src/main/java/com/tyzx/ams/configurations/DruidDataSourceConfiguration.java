/*
 * 文 件 名:  DruidDataSourceConfiguration.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  卢慧 55318
 * 修改时间:  2017年5月7日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.tyzx.ams.configurations;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2017年5月7日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Configuration
@MapperScan(basePackages = "com.tyzx.ams.dao", sqlSessionTemplateRef = "appSqlSessionTemplate")
public class DruidDataSourceConfiguration {
	@Bean("appDataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource druidDataSource()
	{
		DruidDataSource druidDataSource = new DruidDataSource();
		return druidDataSource;
	}


	@Bean(name = "appSqlSessionFactory")
	@Primary
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("appDataSource") DataSource dataSource) throws Exception
	{
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources("classpath:com/tyzx/ams/dao/*Mapper.xml"));
		return bean.getObject();
	}

	@Bean(name = "appTransactionManager")
	@Primary
	public DataSourceTransactionManager testTransactionManager(@Qualifier("appDataSource") DataSource dataSource)
	{
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "appSqlSessionTemplate")
	@Primary
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("appSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception
	{
		return new SqlSessionTemplate(sqlSessionFactory);
	}

	@Bean
	public Slf4jLogFilter logFilter()
	{
		Slf4jLogFilter filter = new Slf4jLogFilter();
		return filter;
	}

	@Bean
	public FilterRegistrationBean druidStatFilter()
	{
		FilterRegistrationBean registration = new FilterRegistrationBean();
		WebStatFilter filter = new WebStatFilter();
		registration.setFilter(filter);
		registration.addUrlPatterns("/*");
		registration.addInitParameter("exclusions",
				"/public/*,*.js,*.css,/druid*,*.jsp,*.swf,*.html,*.htm,*.jpg,*.png,*,gif,*,bmp");
		registration.setName("druidStatFilter");
		registration.setOrder(Integer.MAX_VALUE);
		return registration;
	}

	@Bean
	@Order(999)
	public ServletRegistrationBean StatViewServlet()
	{
		ServletRegistrationBean registration = new ServletRegistrationBean();
		StatViewServlet servlet = new StatViewServlet();

		registration.setServlet(servlet);
		registration.setLoadOnStartup(Integer.MAX_VALUE);
		registration.addInitParameter("loginUsername", "bai");
		registration.addInitParameter("loginPassword", "Aa12345@");
		registration.addUrlMappings("/druid/*");

		return registration;
	}
}
