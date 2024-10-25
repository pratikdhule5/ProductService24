package com.Pratik.ProductService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

//    @GetMapping(path="")
//    public void getProductByID(@PathVariable int productId){
//
//    }
    //endpoint name:GET/hello
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    //endpoint name:get/hello.{name}
    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable("name")String name){
        return "Hello "+name;
    }

    //endpoint name:get/show/{showId}/seat/{seatId}
    @GetMapping("/show/{showId}/seat/{seatId}")
    public String bmsExample(@PathVariable("showId") String showId,@PathVariable("seatId")String seatId){
        return "BMS Example with show id "+showId+" and seat id "+seatId;
    }
}
