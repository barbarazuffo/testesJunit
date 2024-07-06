package br.com.barbarazuffo.api.services;

import br.com.barbarazuffo.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
