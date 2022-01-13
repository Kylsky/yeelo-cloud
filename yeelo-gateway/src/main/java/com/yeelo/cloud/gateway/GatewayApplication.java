package com.yeelo.cloud.gateway;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Service
    public class TestService {

        @SentinelResource(value = "sayHello")
        public String sayHello(String name) {
            return "Hello, " + name;
        }
    }

    @RestController
    public class TestController {

        @Autowired
        private TestService testService;

        @GetMapping(value = "/hello/{name}")
        public String apiHello(@PathVariable String name) {
            return testService.sayHello(name);
        }
    }
}
