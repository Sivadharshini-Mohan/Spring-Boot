package com.i2i.employee.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class AuthRequest {

        private String userName;
        private String password;
    }

