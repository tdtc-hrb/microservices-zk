package com.example.demo.feign.springcloud_zk;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Configuration
@EnableFeignClients
public class FindAllClient {
	@Autowired
	TheClient theClient;
	
	@FeignClient(name = "userDetails")
    interface TheClient {
  
        @RequestMapping(path = "/user/listPage", method = RequestMethod.GET)
        String findAll();
    }
	
	public String findAll() {
		return theClient.findAll();	
	}
}
