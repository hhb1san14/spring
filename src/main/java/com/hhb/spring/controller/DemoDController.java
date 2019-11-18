package com.hhb.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huanghongbo
 * @Date: 2019-11-18 09:59
 * @Description:
 */
@RestController
public class DemoDController {

    private DemoCController demoCController;

    @Autowired
    public DemoDController(DemoCController demoCController) {
        this.demoCController = demoCController;
    }
}
