package com.rodrigues.jeferson.basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigues.jeferson.basic.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
 