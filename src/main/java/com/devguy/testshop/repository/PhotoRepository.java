package com.devguy.testshop.repository;

import com.devguy.testshop.collections.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
