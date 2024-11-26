package br.com.uanscarvalho.api.config;

import br.com.uanscarvalho.api.domain.User;
import br.com.uanscarvalho.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        User u1 = new User(null, "Valdir", "valdir@gmail.com", "123");
        User u2 = new User(null, "Luiz", "luiz@gmail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
