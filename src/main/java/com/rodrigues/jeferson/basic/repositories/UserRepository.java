package com.rodrigues.jeferson.basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigues.jeferson.basic.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
