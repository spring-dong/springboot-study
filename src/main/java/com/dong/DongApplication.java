package com.dong;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableApolloConfig
@MapperScan("com.dong.dao")
public class DongApplication {

	public static void main(String[] args) {

		SpringApplication.run(DongApplication.class, args);
	}
}
