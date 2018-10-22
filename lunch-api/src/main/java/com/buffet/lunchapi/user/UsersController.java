package com.buffet.lunchapi.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.buffet.lunchapi.user.domain.UsersRepository;
import com.buffet.lunchapi.user.dto.UsersSaveRequestDto;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UsersController {

    private UsersRepository usersRepository;

    @PostMapping("/users")
    public void savePosts(@RequestBody UsersSaveRequestDto dto) {
        usersRepository.save(dto.toEntity());
    }
}