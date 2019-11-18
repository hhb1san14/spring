package com.hhb.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huanghongbo
 * @Date: 2019-11-18 09:57
 * @Description:
 */
@RestController
public class DemoAController {

    @Autowired
    private DemoBController demoBController;


}
