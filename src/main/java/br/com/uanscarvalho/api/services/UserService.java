package br.com.uanscarvalho.api.services;

import br.com.uanscarvalho.api.domain.User;
import br.com.uanscarvalho.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
