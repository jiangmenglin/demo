package com.example.demo.service.impl;

import com.example.demo.jdbc.dao.CountryMapper;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private  CountryMapper countryMapper;
}
