package com.example.demo.controller;

import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class CityController {

    @Autowired
    private  CityService cityService;

    @RequestMapping(method = RequestMethod.GET, value = "/city/list")
    public String getCityList() {
        return cityService.getCityList();
    }
}
