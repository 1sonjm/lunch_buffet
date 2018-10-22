package com.buffet.lunchapi.user.dto;

import com.buffet.lunchapi.user.domain.Users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsersSaveRequestDto {

    private String id;
    private String password;
    private String name;

    public Users toEntity() {
        return Users.builder().password(password).name(name).build();
    }
}
