package br.com.rhfactor.samplecrudapi.controllers;

import br.com.rhfactor.samplecrudapi.dtos.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @PostMapping("login")
    public @ResponseBody Boolean login(@RequestBody LoginForm form){
        if( form.getUsername().equals("admin") && form.getPassword().equals("Senha1234") ){
            return true;
        }
        return false;
    }

}
