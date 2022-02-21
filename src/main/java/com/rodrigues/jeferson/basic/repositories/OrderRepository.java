package com.rodrigues.jeferson.basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigues.jeferson.basic.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
 