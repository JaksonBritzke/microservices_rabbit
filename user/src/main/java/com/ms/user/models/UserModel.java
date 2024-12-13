package com.ms.user.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String userId;
    private String name;
    private String email;

}
