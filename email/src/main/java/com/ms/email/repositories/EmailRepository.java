package com.ms.email.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.ms.email.models.EmailModel;

public interface EmailRepository extends MongoRepository<EmailModel, String> {
}
