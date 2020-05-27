package com.example.demo.controller;

import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class CityController {

    @Autowired
    private  CityService cityService;

    @RequestMapping(method = RequestMethod.GET, value = "/city/list")
    public String getCityList() {
        return cityService.getCityList();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/city/id")
    public String getCityById(@RequestParam("cityId") Integer id) {
        return cityService.getCityById(id);
    }
}
