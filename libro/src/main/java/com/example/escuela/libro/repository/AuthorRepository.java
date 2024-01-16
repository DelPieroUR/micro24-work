package com.example.escuela.libro.repository;

import com.example.escuela.libro.apimodel.AuthorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Integer> {
    
}
