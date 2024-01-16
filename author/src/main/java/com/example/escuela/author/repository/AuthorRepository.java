package com.example.escuela.author.repository;

import com.example.escuela.author.apimodel.AuthorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Integer> {
    
}
