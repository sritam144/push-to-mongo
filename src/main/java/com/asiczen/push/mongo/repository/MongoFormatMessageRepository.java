package com.asiczen.push.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.asiczen.push.mongo.model.MongoFormatMessage;

@Repository
public interface MongoFormatMessageRepository extends MongoRepository<MongoFormatMessage, String> {

}
