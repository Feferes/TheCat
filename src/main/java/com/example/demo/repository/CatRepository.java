package com.example.demo.repository;

import com.example.demo.model.Cat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cat", path = "cat")
public interface CatRepository extends MongoRepository<Cat, String> {
    List<Cat> findByName(@Param("name") String name);

    List<Cat> findByTemperamentContains(@Param("temperament") String temperament);

    List<Cat> findByOriginContains(@Param("origin") String origin);
}
