package com.buffet.lunchapi.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buffet.lunchapi.user.domain.Users;
import com.buffet.lunchapi.user.domain.UsersRepository;

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
