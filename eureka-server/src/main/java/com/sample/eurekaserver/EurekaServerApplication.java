package com.sample.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动一个服务注册中心，只需要一个注解@EnableEurekaServer
 * eureka是一个高可用的组件，它没有后端缓存，每一个实例注册之后需要向注册中心发送心跳
 * 在默认情况下eureka server也是一个eureka client ,必须要指定一个 server
 * @author storm
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
