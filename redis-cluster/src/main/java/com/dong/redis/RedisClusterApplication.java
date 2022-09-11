package com.dong.redis;


import com.dong.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class RedisClusterApplication {

	public static void main(String[] args) {

		SpringApplication.run(RedisClusterApplication.class, args);
	}


	@Autowired
	private RedisUtil redisUtil;

	@GetMapping("/redis")
	public String getRedis(){
		for (int i = 0; i < 10; i++) {
			redisUtil.set(String.valueOf(System.currentTimeMillis()),"12355");

		}

		return "getRedis";
	}
}
