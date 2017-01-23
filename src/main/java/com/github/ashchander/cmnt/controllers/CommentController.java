package com.github.ashchander.cmnt.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ashwin on 1/22/2017.
 */
@RestController
public class CommentController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
