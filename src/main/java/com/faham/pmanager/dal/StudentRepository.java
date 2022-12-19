package com.faham.pmanager.dal;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentRepository, String> {

}
