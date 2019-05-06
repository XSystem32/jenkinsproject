package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> numbers = new ArrayList<>();
    private String lion;
    private int bratha;

    @GetMapping("/")
    public String home() {
        System.out.println("Test the code line");
        return "index";
    }

}
