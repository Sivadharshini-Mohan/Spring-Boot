package com.i2i.employee.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TBL")
public class Users implements Serializable {
        @Id
        private int id;
        private String userName;
        private String password;
        private String email;
    }


