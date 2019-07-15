package cn.sunline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sunline
 * @Date 2018年12月1日
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp2 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp2.class, args);
	}

}
