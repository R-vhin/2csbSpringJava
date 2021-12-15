package com.samplefullstack2csb.samplefullstack.controller;

import com.samplefullstack2csb.samplefullstack.computations.Computation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greet")
@CrossOrigin("*")
public class Greet {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!" + Computation.sumOfTwoNum();
    }

    @RequestMapping("/hi")
    public String hi(){
        return "Hi World!";
    }
}
