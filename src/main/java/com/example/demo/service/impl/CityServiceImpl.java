package com.example.demo.service.impl;

import com.example.demo.jdbc.dao.CityMapper;
import com.example.demo.jdbc.entity.City;
import com.example.demo.service.CityService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Service
public class CityServiceImpl implements CityService {

    Logger logger = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private  CityMapper cityMapper;

    Gson gson = new Gson();

    @Autowired
    private RedisTemplate<String, Serializable> stringSerializableRedisTemplate;


    @Override
    public String getCityList() {

        List<City> list = cityMapper.selectAll();

        return gson.toJson(list);
    }

    @Override
    public String getCityById(Integer id) {
        City city = null;
        city = (City)stringSerializableRedisTemplate.opsForValue().get("" + id);
        if (city == null) {
            logger.info("缓存中没有该数据！key:" + id);
            city = cityMapper.selectByPrimaryKey(id);
            if (city != null) {
                stringSerializableRedisTemplate.opsForValue().set("" + id, city, 1, TimeUnit.MINUTES);
            }
        }

        return gson.toJson(city);
    }
}
