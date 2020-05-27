package com.example.demo.service.impl;

import com.example.demo.jdbc.dao.CityMapper;
import com.example.demo.jdbc.entity.City;
import com.example.demo.service.CityService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private  CityMapper cityMapper;


    @Override
    public String getCityList() {

        List<City> list = cityMapper.selectAll();
        Gson gson = new Gson();
        return gson.toJson(list);
    }
}
