package com.example.apigateway;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringJpaRepo extends JpaRepository<Book,Integer> {

}
