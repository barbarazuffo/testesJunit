package br.com.barbarazuffo.api.services.impl;

import br.com.barbarazuffo.api.domain.User;
import br.com.barbarazuffo.api.repositories.UserRepository;
import br.com.barbarazuffo.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;
    @Override
    public User findById(Integer id) {
        Optional<User> objeto = repository.findById(id);
        return objeto.orElse(null);
    }
}