package br.com.rhfactor.samplecrudapi.services;

import br.com.rhfactor.samplecrudapi.domains.User;
import br.com.rhfactor.samplecrudapi.dtos.UserForm;
import br.com.rhfactor.samplecrudapi.repository.UserRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public String getNickname(){
        return RandomStringUtils.random(10, true, false);
    }

    public User create(UserForm form) {

        User user = new User();
        user.setName( form.getName() );
        user.setAmount( new BigDecimal(10.00));
        user.setAge( form.getAge() );

        user.setNickname( getNickname() );

        return userRepository.save(user);
    }

    public List<User> listAll() {
        return (List<User>)userRepository.findAll();
    }
}
