package br.com.rhfactor.samplecrudapi.controllers;

import br.com.rhfactor.samplecrudapi.domains.User;
import br.com.rhfactor.samplecrudapi.dtos.UserForm;
import br.com.rhfactor.samplecrudapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> listarTodos(){
        return userService.listAll();
    }

    @PostMapping
    public @ResponseBody User create(@RequestBody UserForm form){
        return userService.create(form);
    }

}
