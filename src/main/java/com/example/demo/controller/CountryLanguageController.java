package com.example.demo.controller;

import com.example.demo.service.CountryLanguageService;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryLanguageController {

    @Autowired
    private static CountryLanguageService countryLanguageService;
}
