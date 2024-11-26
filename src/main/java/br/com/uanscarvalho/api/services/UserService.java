package br.com.uanscarvalho.api.services;

import br.com.uanscarvalho.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
