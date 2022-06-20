package com.atguigu.springcloud;

import com.atguigu.myrule.MySelRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelRule.class)

public class DeptController80_Consumer {
    public static void main(String[] args) {
        SpringApplication.run(DeptController80_Consumer.class,args);
    }

}
