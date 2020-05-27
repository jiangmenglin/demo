package com.example.demo.service.impl;

import com.example.demo.jdbc.dao.CountrylanguageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryLanguageServiceImpl {

    @Autowired
    private  CountrylanguageMapper countrylanguageMapper;
}
