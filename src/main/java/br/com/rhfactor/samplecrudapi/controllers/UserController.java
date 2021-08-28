package br.com.rhfactor.samplecrudapi.controllers;

import br.com.rhfactor.samplecrudapi.domains.User;
import br.com.rhfactor.samplecrudapi.dtos.UserForm;
import br.com.rhfactor.samplecrudapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> listarTodos(){
        return (List<User>) userRepository.findAll();
    }

    @PostMapping
    public @ResponseBody User create(@RequestBody UserForm form){
        // SALVAR NO BANCO DE DADOS
        User user = User.builder()
                .name( form.getName() )
                .build();
        return userRepository.save(user);
    }

}
