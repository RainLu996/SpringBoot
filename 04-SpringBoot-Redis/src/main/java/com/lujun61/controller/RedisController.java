package com.lujun61.controller;

import com.lujun61.pojo.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {
    /**
     * 默认使用JDK的序列化(可以人为更改)
     */
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 使用String的序列化
     */
    @Resource
    private StringRedisTemplate stringRedisTemplate;



    @RequestMapping("/addData/{key}/{value}")
    public String addDataToRedis(@PathVariable String key, @PathVariable String value) {
        //操作Redis中String类型的数据
        ValueOperations<String, Object> string = redisTemplate.opsForValue();
        string.set(key,value);

        return "添加数据到Redis中";
    }
    @RequestMapping("/getData")
    public Object getDataForRedis() {
        ValueOperations<String, Object> string = redisTemplate.opsForValue();
        return string.get("first");
    }


    /**
     * 设置RedisTemplate的序列化类型
     */
    @GetMapping("/str/{key}/{value}")
    public String setRedisTemplateSerializer(@PathVariable String key, @PathVariable String value) {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());

        redisTemplate.opsForValue().set(key, value);

        return "设置RedisTemplate的序列化类型";
    }
    /**
     * 设置RedisTemplate的序列化类型为JSON
     */
    @GetMapping("/json")
    public Object jsonSerial() {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setKeySerializer(new Jackson2JsonRedisSerializer<>(User.class));

        redisTemplate.opsForValue().set("user2", new User(19, "lujun"));

        return redisTemplate.opsForValue().get("user2");
    }
}
