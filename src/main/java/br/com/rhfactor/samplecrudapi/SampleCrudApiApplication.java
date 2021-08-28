package br.com.rhfactor.samplecrudapi;

import br.com.rhfactor.samplecrudapi.dtos.LoginForm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleCrudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleCrudApiApplication.class, args);
    }

    public void adicionar(){

        LoginForm login = LoginForm.builder()
                .username("nome")
                .password("senha")
                .build();


    }

}
