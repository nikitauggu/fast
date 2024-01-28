package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String index(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "rabota", required = false) String rabota)   {
        System.out.println("Начальник, " + name);
        System.out.println("Должность, " + rabota);
        return "Начальник: Худяков Должность: механик";
    }
}
