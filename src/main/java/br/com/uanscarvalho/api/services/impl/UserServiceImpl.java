package br.com.uanscarvalho.api.services.impl;

import br.com.uanscarvalho.api.domain.User;
import br.com.uanscarvalho.api.repositories.UserRepository;
import br.com.uanscarvalho.api.services.UserService;
import br.com.uanscarvalho.api.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Usuario Não Encontrado"));
    }
}
