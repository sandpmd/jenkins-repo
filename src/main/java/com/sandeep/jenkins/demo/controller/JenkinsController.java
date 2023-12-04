package com.sandeep.jenkins.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/entry/point")
public class JenkinsController {
    @GetMapping("/print")
    public ResponseEntity getName(){
        System.out.println("Hello World!!");
        return new ResponseEntity(HttpStatus.OK);
    }
}
