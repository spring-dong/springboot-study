package com.dong.redis;


import com.dong.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class RedisClusterApplication {

	public static void main(String[] args) {

		SpringApplication.run(RedisClusterApplication.class, args);
	}


	@Autowired
	private RedisUtil redisUtil;

	@GetMapping("/redis/{key}")
	public String getRedis(@PathVariable("key") String key){
		String string = redisUtil.getString(key);
		System.out.printf(string+"==========");
		return "123";
	}
}
