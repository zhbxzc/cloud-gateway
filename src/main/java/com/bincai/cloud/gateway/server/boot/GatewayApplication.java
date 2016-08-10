package com.bincai.cloud.gateway.server.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/*import org.springframework.cloud.sleuth.Sampler;*/
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication
{
	/*@Bean
	Sampler sampler()
	{
		return span -> true;
	}*/

	public static void main(String[] args)
	{
		SpringApplication.run(GatewayApplication.class, args);
	}

	/**
	 * 执行请求前的过滤器
	 * @return
	 */
	@Bean
	public PreFilter simpleFilter()
	{
		return new PreFilter();
	}
}
