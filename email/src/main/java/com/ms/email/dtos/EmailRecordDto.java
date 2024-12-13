package com.ms.email.dtos;

public record EmailRecordDto(String userId,
        String emailTo,
        String subject,
        String text) {
}
