package com.shipmap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: Ivan
 * @date: 2021年02月27日 18:55
 */

@RestController
public class Index {

    @RequestMapping("index")
    String index(){
        return "first index!";
    }
}
