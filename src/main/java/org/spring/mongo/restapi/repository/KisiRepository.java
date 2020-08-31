package org.spring.mongo.restapi.repository;


import org.spring.mongo.restapi.entity.Kisi;
import org.springframework.data.mongodb.repository.MongoRepository;

// Veritabanai CRUD Islemlerinin Yapilacagi Sinif

public interface KisiRepository extends MongoRepository<Kisi,String> {

}
