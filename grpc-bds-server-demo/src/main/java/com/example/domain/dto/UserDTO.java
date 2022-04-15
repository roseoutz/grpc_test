package com.example.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder
@Getter
@AllArgsConstructor
public class UserDTO implements Serializable {
    private String oid;
    private String userId;
    private String username;
    private String password;
    private String cellPhone;
}
