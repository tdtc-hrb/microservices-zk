package com.example.demo.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
//import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;

import com.example.demo.keyResolver.RemoteAddrKeyResolver;


@Component
public class RequestRateLimiterCustom {

	@Bean(name = "remoteAddrKeyResolver")
	public RemoteAddrKeyResolver remoteAddrKeyResolver() {
	    return new RemoteAddrKeyResolver();
	}
}
