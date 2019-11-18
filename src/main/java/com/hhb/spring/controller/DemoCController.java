package com.hhb.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huanghongbo
 * @Date: 2019-11-18 09:59
 * @Description:
 */
@RestController
public class DemoCController {


    private DemoDController demoDController;

    @Autowired
    public DemoCController(DemoDController demoDController) {
        this.demoDController = demoDController;
    }


}
