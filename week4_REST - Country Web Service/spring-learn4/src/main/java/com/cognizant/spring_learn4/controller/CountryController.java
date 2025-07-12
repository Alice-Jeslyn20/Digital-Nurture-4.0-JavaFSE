package com.cognizant.spring_learn4.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn4.model.Country;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START getCountryIndia");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country india = (Country) context.getBean("in");
        context.close();

        LOGGER.info("END getCountryIndia");
        return india;
    }
}

