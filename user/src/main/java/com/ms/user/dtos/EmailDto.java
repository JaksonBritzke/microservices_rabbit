package com.ms.user.dtos;

import lombok.Data;

@Data
public class EmailDto {

    private String userId;
    private String emailTo;
    private String subject;
    private String text;
}
