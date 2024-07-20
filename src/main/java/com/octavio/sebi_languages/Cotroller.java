package com.octavio.sebi_languages;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Cotroller {

    @GetMapping
    public String getHello() {
        return "Hello, world";
    }
}
