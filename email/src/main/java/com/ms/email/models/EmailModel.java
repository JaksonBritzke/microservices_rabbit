package com.ms.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ms.email.enums.StatusEmail;

import lombok.Data;

@Data
@Document
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String emailId;
    private String userId;
    private String emailFrom;
    private String emailTo;
    private String subject;
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

}
