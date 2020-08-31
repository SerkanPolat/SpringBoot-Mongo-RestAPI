package org.spring.mongo.restapi;

import org.spring.mongo.restapi.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableMongoRepositories //MongoDb repositoryleri aktif hale getiriliyor.
@EnableAutoConfiguration
public class App 
{

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
