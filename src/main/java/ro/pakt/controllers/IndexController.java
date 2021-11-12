package ro.pakt.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
    public String index(){
        return "index";
    }
}
