package br.com.rhfactor.samplecrudapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/")
    public @ResponseBody String indexPage(){
        return "Servidor funcionando!";
    }

}
