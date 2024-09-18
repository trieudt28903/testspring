package com.dev.shopdienthoai.demo.controller;

import com.dev.shopdienthoai.demo.until.error.IdInvalidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getHelloWorld() throws IdInvalidException {
        return "Hello World (Hỏi Dân IT & Eric)";
    }
}
