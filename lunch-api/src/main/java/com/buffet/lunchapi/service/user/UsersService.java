package com.buffet.lunchapi.service.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buffet.lunchapi.service.user.domain.Users;
import com.buffet.lunchapi.service.user.domain.UsersRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UsersService {
    private UsersRepository usersRepository;

    @Transactional
    public void save(Users entity) {
        usersRepository.save(entity);
    }

}
