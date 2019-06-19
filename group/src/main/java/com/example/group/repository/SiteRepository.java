package com.example.group.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.group.entity.SiteEntity;

public interface SiteRepository extends MongoRepository<SiteEntity, String> {

}
