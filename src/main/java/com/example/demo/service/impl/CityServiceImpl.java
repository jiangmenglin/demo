package com.example.demo.service.impl;

import com.example.demo.jdbc.dao.CityMapper;
import com.example.demo.jdbc.entity.City;
import com.example.demo.service.CityService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Service
public class CityServiceImpl implements CityService {

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
            city = cityMapper.selectByPrimaryKey(id);
            if (city != null) {
                stringSerializableRedisTemplate.opsForValue().set("" + id, city, 5, TimeUnit.SECONDS);
            }
        }

        return gson.toJson(city);
    }
}
