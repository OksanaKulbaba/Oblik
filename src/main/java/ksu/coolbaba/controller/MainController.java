package ksu.coolbaba.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting() {
        return "index";
    }
    @GetMapping("/index")
    public String greeting2() {
        return "index";
    }
    @GetMapping("/login")
    public String greeting3() {
        return "login";
    }

}
