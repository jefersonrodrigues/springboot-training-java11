package com.rodrigues.jeferson.basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigues.jeferson.basic.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
 