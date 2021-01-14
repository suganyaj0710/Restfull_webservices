package com.Restfullwebservices.Restfull_services;

import org.hibernate.annotations.Generated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@RestController
public class Rest_Controller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/helloWorld")
    public hello_bean helloWorld(){
        return new hello_bean("helloWorld");
    }
    //path_variable
    @GetMapping("/hello/path_variable/{name}")
            public hello_bean hellobeanvariable(@PathVariable String name){
            return new hello_bean(String.format("hello madam,%s", name));
            }


}
