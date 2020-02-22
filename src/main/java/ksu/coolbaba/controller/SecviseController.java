package ksu.coolbaba.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecviseController {

    @GetMapping("/servise")
    public String servise(){

        return "servise";
    }
}
